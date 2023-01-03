package java;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class URI1566 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i += 1) {
			int p = sc.nextInt();
			sc.nextLine();

			int[] heigth = new int[p];

			for (int j = 0; j < heigth.length; j++) {
				heigth[j] = sc.nextInt();
			}

			Arrays.sort(heigth);

			System.out.println(Arrays.toString(heigth).replaceAll("^\\[|,|\\]", ""));
		}

		sc.close();
	}
}
