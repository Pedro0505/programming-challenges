package java;

import java.io.IOException;
import java.util.Scanner;

public class URI1019 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		Integer inputSeconds = sc.nextInt();
		
		int hours = inputSeconds / 3600;
		int hoursRest = inputSeconds % 3600;
		int minutes = hoursRest / 60;
		int seconds = hoursRest % 60;
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
		
		sc.close();
	}
}
