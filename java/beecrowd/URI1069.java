package beecrowd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    https://www.beecrowd.com.br/judge/pt/problems/view/1069

    João está trabalhando em uma mina, tentando retirar o máximo que consegue de diamantes "<>". Ele deve excluir todas as particulas de areia "." 
    do processo e a cada retirada de diamante, novos diamantes poderão se formar. Se ele tem como uma entrada .<...<<..>>....>....>>>., três diamantes são formados. 
    O primeiro é retirado de <..>, resultando  .<...<>....>....>>>. Em seguida o segundo diamante é retirado, restando .<.......>....>>>. O terceiro diamante é então retirado, restando no final .....>>>., 
    sem possibilidade de extração de novo diamante.

    Entrada
    Deve ser lido um valor inteiro N que representa a quantidade de casos de teste. Cada linha a seguir é um caso de teste que contém até 1000 caracteres, incluindo "<,>, ."

    Saída
    Você deve imprimir a quantidade de diamantes possíveis de serem extraídos em cada caso de entrada.


*/

public class URI1069 {
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		
		List<Integer> result = new ArrayList<>();
		
		for (int i = 0; i < n; i += 1) {
			String input = sc.nextLine();
			
			int count = 0;

			String removeDots = input.replaceAll("[.]", "");

			while (removeDots.contains("<>")) {
				removeDots = removeDots.replaceFirst("<>", "");
				count += 1;
			}

			result.add(count);
		}
		
		result.forEach(System.out::println);

		sc.close();
    }
}
