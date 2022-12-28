package java;

import java.io.IOException;

import java.util.*;

/*
    https://www.beecrowd.com.br/judge/pt/problems/view/1038

    Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

    Entrada
    O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

    Saída
    O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal. 
*/

public class URI1038 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Map<String, Double> stock = new TreeMap<>();

		stock.put("1", 4.00);
		stock.put("2", 4.50);
		stock.put("3", 5.00);
		stock.put("4", 2.00);
		stock.put("5", 1.50);

		String[] line = sc.nextLine().split(" ");

		double price = stock.get(line[0]);
		double quantity = Double.parseDouble(line[1]);
		
		System.out.println(price);
		System.out.println(quantity);
		
		double result = price * quantity;

		System.out.printf("Total: R$ %.2f\n", result);

		sc.close();
	}
}
