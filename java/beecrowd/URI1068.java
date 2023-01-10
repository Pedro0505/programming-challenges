package beecrowd;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI1068 {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String str = sc.nextLine();
			
			char[] splitedStr = str.toCharArray();
			
			int open = 0;
			int close = 0;
			
			boolean isValid = false;
			
			List<Character> l = new ArrayList<>();
			
			for (int i = 0; i < splitedStr.length; i += 1) {
				if (splitedStr[i] == '(') {
					open += 1;
					l.add(splitedStr[i]);
				}
				
				if (splitedStr[i] == ')') {
					close += 1;
					l.add(splitedStr[i]);
				}
			}
			
			if (l.get(0) == '(' && l.get(l.size() - 1) == ')') {
				isValid = true;
			}
			
			System.out.println((isValid && open == close) ? "correct" : "incorrect");
		}
    }
}
