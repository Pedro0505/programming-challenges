package leetcode;

import java.util.ArrayList;
import java.util.Collections;

// https://leetcode.com/problems/plus-one/submissions/872239586/

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < accounts.length; i += 1) {
			int sum = 0;

			for (int j = 0; j < accounts[i].length; j++) {
				sum += accounts[i][j];
			}

			result.add(sum);
		}
		
		Collections.sort(result);

		return result.get(result.size() - 1);
    }

    public static void main(String[] args) {
		int[][] arr = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(maximumWealth(arr));
    }
}
