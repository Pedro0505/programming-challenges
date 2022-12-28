package java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class URI1168 {
    public static Integer countLeds(String num) {
		Map<String, Integer> ledsValue = new TreeMap<>();
		
		ledsValue.put("1", 2);
		ledsValue.put("2", 5);
		ledsValue.put("3", 5);
		ledsValue.put("4", 4);
		ledsValue.put("5", 5);
		ledsValue.put("6", 6);
		ledsValue.put("7", 3);
		ledsValue.put("8", 7);
		ledsValue.put("9", 6);
		ledsValue.put("0", 6);
		
		List<String> list = Arrays.asList(num.split(""));
		
		return list.stream().map((e) -> ledsValue.get(e)).reduce(0, (acc, cur) -> cur + acc);
	}
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		List<Integer> result = new ArrayList<>();

		int n = sc.nextInt();

		for (int i = 0; i < n; i += 1) {
			String numberToLed = sc.next();
			result.add(countLeds(numberToLed));
		}
		
		for (Integer i: result) {
			System.out.println(i + " leds");
		}
		
		sc.close();
    }
}
