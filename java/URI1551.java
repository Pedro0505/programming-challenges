package java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
    https://www.beecrowd.com.br/judge/pt/problems/view/1551
    
    Seu professor de português não para de trazer coisas novas para a sala, e hoje não foi diferente. Existe uma cidade, segundo seu professor, onde as pessoas levam muito a sério a forma como elas se comunicam. 
    Em especial, quando duas pessoas estão conversando, elas pensam muito nas frases antes de dizê-las, de forma a garantir que tal frase seja uma “frase completa”, ou talvez uma “frase quase completa”.

    Considerando o nosso alfabeto de 26 letras, uma frase é dita “completa” quando ela contém todas as letras do alfabeto contidas nela. 
    De modo semelhante, uma frase é dita “quase completa” se ela não é completa, porém contém ao menos metade das letras do alfabeto contidas nela. 
    Quando uma frase não é “completa” e nem “quase completa”, ela é dita “mal elaborada”.

    Seu professor lhe deu uma tarefa muito difícil: dadas várias frases trocadas entre vários habitantes da cidade citada, diga em qual das categorias acima a frase se encaixa.

    Entrada
    A primeira linha contém um inteiro N, indicando o número de casos de teste a seguir.

    Cada caso de teste contém uma linha, contendo letras minúsculas, espaços em branco e/ou vírgulas. O número de caracteres de cada linha é no mínimo 3 e no máximo 1000, contando com os espaços.

    Saída
    Para cada caso de teste, imprima uma linha contendo uma das seguintes frases: “frase completa”, quando a frase é considerada completa; “frase quase completa”, quando a frase não é completa, 
    mas é considerada quase completa; ou “frase mal elaborada”, quando ela não é completa e nem quase completa.
 */

public class URI1551 {
	public static String checkCompletePhrase(String phrase, String p) {
		String cleanStr = phrase.toLowerCase().replaceAll(p, "");
		
		Set<String> set = new HashSet<>(Arrays.asList(cleanStr.split("")));
		
		if (set.size() == 26) {
			return "frase completa";
		}
		
		if (set.size() >= 13) {
			return "frase quase completa";
		}
		
		return "frase mal elaborada";
	}

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		List<String> result = new ArrayList<>();
		
		String p = "[ `!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?~]";
				
		for (int i = 0; i < n; i += 1) {
			String phrase = sc.nextLine();
			String checked = checkCompletePhrase(phrase, p);
			result.add(checked);
		}
		
		result.stream().forEach(System.out::println);
		
		sc.close();
    }
}
