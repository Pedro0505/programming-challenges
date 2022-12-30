package java;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// https://www.beecrowd.com.br/judge/pt/problems/view/1244

public class URI1244 {
    	static void sort(String[] s, int n) {
		for (int i = 1; i < n; i++) {
			String temp = s[i];

			int j = i - 1;

			while (j >= 0 && temp.length() > s[j].length()) {
				s[j + 1] = s[j];
				j--;
			}
			s[j + 1] = temp;
		}
	}

	static String serializeStringArr(String[] arr) {
		return String.join(",", Arrays.asList(arr)).replace(",", " ");
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i += 1) {
			String input = sc.nextLine();

			String[] splitedStr = input.split(" ");

			sort(splitedStr, splitedStr.length);

			String result = serializeStringArr(splitedStr);

			System.out.println(result);
		}

		sc.close();
	}
}
