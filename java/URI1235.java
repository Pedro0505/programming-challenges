package java;
import java.io.IOException;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    https://www.beecrowd.com.br/judge/pt/problems/view/1235

    A sua impressora foi infectada por um vírus e está imprimindo de forma incorreta. Depois de olhar para várias páginas impressas por um tempo, 
    você percebe que ele está imprimindo cada linha de dentro para fora. Em outras palavras, a metade esquerda de cada linha está sendo impressa a partir do meio da página até a margem esquerda. 
    Do mesmo modo, a metade direita de cada linha está sendo impressa à partir da margem direita e prosseguindo em direção ao centro da página.

    Por exemplo a linha:
    THIS LINE IS GIBBERISH

    está sendo impressa como:
    I ENIL SIHTHSIREBBIG S

    Da mesma foma, a linha " MANGOS " está sendo impressa incorretamente como "NAM  SOG". Sua tarefa é desembaralhar (decifrar) a string a partir da forma como ela foi impressa para a sua forma original. 
    Você pode assumir que cada linha conterá um número par de caracteres.

    Entrada
    A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. 
    Seguem N linhas, cada uma com uma frase com no mínimo 2 e no máximo 100 caracteres de letras maiúsculas e espaços que deverá ser desembaralhada (decifrada) à partir da forma impressa para a sua forma original, 
    conforme especificação acima.

    Saída
    Para cada linha de entrada deverá ser impressa uma linha de saída com a frase decifrada, conforme a especificação acima.
*/

public class URI1235 {
    
    public static String reverseString(String str) {
		String reversedString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString = reversedString + str.charAt(i);
		}

		return reversedString;
	}
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		List<String> result = new ArrayList<>();

		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i += 1) {
			String str = sc.nextLine();
			
			int strLength = str.length();

			String firstHalf = reverseString(str.substring(0, strLength / 2));
			String secondHalf = reverseString(str.substring(strLength / 2, strLength));

			result.add(firstHalf + secondHalf);
		}
		
		result.stream().forEach(System.out::println);

		sc.close();
    }
}
