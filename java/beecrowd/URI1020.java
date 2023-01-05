package beecrowd;

import java.io.IOException;
import java.util.*;

/*
    https://www.beecrowd.com.br/judge/pt/problems/view/1020
    
    Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

    Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
     Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

    Entrada
    O arquivo de entrada contém um valor inteiro.

    Saída
    Imprima a saída conforme exemplo fornecido.
*/

public class URI1020 {
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);

		int inputDays = sc.nextInt();
		
		int years = 0;
		int months = 0; 
		
		while (inputDays - 365 >= 0) {
			inputDays -= 365;
			years += 1;
		}
		
		while (inputDays - 30 >= 0) {
			inputDays -= 30;
			months += 1;
		}
		
		
		System.out.println(years + " ano(s)");
		System.out.println(months + " mes(es)");
		System.out.println(inputDays + " dia(s)");

		sc.close();
    }  
}
