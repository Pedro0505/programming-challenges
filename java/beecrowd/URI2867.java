package beecrowd;

import java.io.IOException;

import java.util.*;

public class URI2867 {
    
    public static long calcPow(int a, int b) {
        return (long) Math.log10(Math.pow(a, b)) + 1;
    }
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i += 1) {
        	String num = sc.nextLine();

        	String[] splitedNum = num.split(" ");

        	long response = calcPow(Integer.parseInt(splitedNum[0]), Integer.parseInt(splitedNum[1]));
        	
        	System.out.println(response);
        }
        
        sc.close();
    }
}