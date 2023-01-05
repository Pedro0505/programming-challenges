package beecrowd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
    https://www.beecrowd.com.br/judge/pt/problems/view/1168

    João quer montar um painel de leds contendo diversos números. Ele não possui muitos leds, e não tem certeza se conseguirá montar o número desejado. Considerando a configuração dos leds dos números abaixo, faça um algoritmo que ajude João a descobrir a quantidade de leds necessário para montar o valor.

    Obs.: Para programadores de Javascript, recomenda-se o uso de "input.trim().split('\n')" para evitar erros conhecidos.

    Entrada
    A entrada contém um inteiro N, (1 ≤ N ≤ 1000) correspondente ao número de casos de teste, seguido de N linhas, cada linha contendo um número (1 ≤ V ≤ 10100) correspondente ao valor que João quer montar com os leds.

    Saída
    Para cada caso de teste, imprima uma linha contendo o número de leds que João precisa para montar o valor desejado, seguido da palavra "leds".
*/

public class URI1168 {
    public static Integer countLeds(String num) {
		Map<String, Integer> ledsValue = new TreeMap<>();
		
		ledsValue.put("1", 2);
		ledsValue.put("2", 5);
		ledsValue.put("3", 5);
		ledsValue.put("4", 4);
		ledsValue.put("5", 5);
		ledsValue.put("6", 6);
		ledsValue.put("7", 3);
		ledsValue.put("8", 7);
		ledsValue.put("9", 6);
		ledsValue.put("0", 6);
		
		List<String> list = Arrays.asList(num.split(""));
		
		return list.stream().map((e) -> ledsValue.get(e)).reduce(0, (acc, cur) -> cur + acc);
	}
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		List<Integer> result = new ArrayList<>();

		int n = sc.nextInt();

		for (int i = 0; i < n; i += 1) {
			String numberToLed = sc.next();
			result.add(countLeds(numberToLed));
		}
		
		for (Integer i: result) {
			System.out.println(i + " leds");
		}
		
		sc.close();
    }
}
