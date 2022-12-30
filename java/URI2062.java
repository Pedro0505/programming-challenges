package java;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
    https://www.beecrowd.com.br/judge/pt/problems/view/2062
    Mariazinha criou um exercício para as suas irmãs Paula e Marta: ela distribui um texto e pede que ambas corrijam este texto, 
    sabendo que apenas as palavras OBI e URI podem estar escritas de forma errada, e o erro pode estar apenas na última letra.

    Sua tarefa aqui é automatizar este processo, ou seja, criar um programa que faça a correção dos textos distribuídos pela Mariazinha para que ela possa conferir as correções de suas irmãs sem muito trabalho.

    Note que se "OB" ou "UR" forem o início ou parte de uma palavra maior, como por exemplo "OBOS" ou "URAT"), estas palavras não devem ser alteradas.

    Entrada
    A entrada contém duas linhas. A primeira linha contém um valor inteiro N (1 < N < 10000) que indica a quantidade de palavras do texto. 
    A segunda linha contém as palavras do texto, cada uma com o máximo de 20 caracteres ('A'-'Z'), e com no mínimo, uma letra ('A'-'Z').

    Saída
    Seu programa deverá apresentar o texto que foi distribuído por Mariazinha corrigido, segundo os critérios acima estabelecidos.
 */

public class URI2062 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();
	
		sc.nextLine();
		
		String str = sc.nextLine();
		
		List<String> splitedStr = Arrays.asList(str.split(" "));
		
		List<String> a = splitedStr.stream().map((e) -> {
			if (e.length() == 3) {
				if (e.startsWith("OB")) return "OBI";
				if (e.startsWith("UR")) return "URI";
			}

			return e;
		}).collect(Collectors.toList());
		
		System.out.println(String.join(",", a).replace(",", " "));
		
		sc.close();
 
    }
 
}