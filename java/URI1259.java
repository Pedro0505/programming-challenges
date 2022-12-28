package java;

import java.io.IOException;

import java.util.*;

/*
    https://www.beecrowd.com.br/judge/pt/problems/view/1259

    Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo o seguinte critério:

    Primeiro os Pares
    Depois os Ímpares
    Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares em ordem decrescente.

    Entrada
    A primeira linha de entrada contém um único inteiro positivo N (1 < N <= 105) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas conterão, cada uma delas, um valor inteiro não negativo.

    Saída
    Apresente todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo abaixo.
 */

public class URI1259 {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();

		for (int i = 0; i < n; i += 1) {
			int number = sc.nextInt();

			if (number % 2 == 0) {
				even.add(number);
			} else {
				odd.add(number);
			}
		}

		even.stream().sorted().forEach(System.out::println);
		odd.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		sc.close();
    }
}
