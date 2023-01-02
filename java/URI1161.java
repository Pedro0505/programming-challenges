package java;

import java.io.IOException;
import java.util.Scanner;

public class URI1161 {
	public static Long factorial(Long num) {
		if (num >= 1) {
			return num * factorial(num - 1);
		}
		
		return 1L;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String[] nums = sc.nextLine().split(" ");
			
			Long n1 = factorial(Long.parseLong(nums[0]));
			Long n2 = factorial(Long.parseLong(nums[1]));

			System.out.println(n1 + n2);
		}
		
		sc.close();
	}
}
