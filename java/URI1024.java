package java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    https://www.beecrowd.com.br/judge/pt/problems/view/1024

    Solicitaram para que você construisse um programa simples de criptografia. Este programa deve possibilitar enviar mensagens codificadas sem que alguém consiga lê-las. O processo é muito simples. 
    São feitas três passadas em todo o texto.

    Na primeira passada, somente caracteres que sejam letras minúsculas e maiúsculas devem ser deslocadas 3 posições para a direita, 
    segundo a tabela ASCII: letra 'a' deve virar letra 'd', letra 'y' deve virar caractere '|' e assim sucessivamente. Na segunda passada, a linha deverá ser invertida. 
    Na terceira e última passada, todo e qualquer caractere a partir da metade em diante (truncada) devem ser deslocados uma posição para a esquerda na tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`'.

    Por exemplo, se a entrada for “Texto #3”, o primeiro processamento sobre esta entrada deverá produzir “Wh{wr #3”. O resultado do segundo processamento inverte os caracteres e produz “3# rw{hW”. 
        Por último, com o deslocamento dos caracteres da metade em diante, o resultado final deve ser “3# rvzgV”.

    Entrada
    A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro N (1 ≤ N ≤ 1*104), indicando a quantidade de linhas que o problema deve tratar.

    As N linhas contém cada uma delas M (1 ≤ M ≤ 1*103) caracteres.
    Saída
    Para cada entrada, deve-se apresentar a mensagem criptografada.
*/

public class URI1024 {
        public static String nextChar(String str, int positions) {
		String result = "";

		String[] splitedStr = str.split("");
		
		for (int i = 0; i < splitedStr.length; i += 1) {
			if (splitedStr[i].matches("[aA-zZ]")) {
				char c = str.charAt(i);
				c += positions;
				result += c;
			} else {
				result += splitedStr[i];
			}
		}

		return result;
	}
    
    public static String previusChar(StringBuilder str, int positions) {
		for (int i = str.length() / 2; i < str.length(); i++) {
			char c = (char) (str.charAt(i) - positions);
			str.setCharAt(i, c);
		}
		
		return str.toString();
	}
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		List<String> result = new ArrayList<>();
		
		for (int i = 0; i < n; i += 1) {
			String phrase = sc.nextLine();
			
			String firstStep = nextChar(phrase, 3);
			StringBuilder secondStep = new StringBuilder(firstStep).reverse();
			String thirdStep = previusChar(secondStep, 1);
			
			result.add(thirdStep);
		}

		result.stream().forEach(System.out::println);;
		
		sc.close();
    }
 
}
