package tpdf1;

import java.util.HashMap;
import java.util.Map;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 2, 1, 4, 9, 7, 4, 2, 7 };

		Map<Integer, Integer> freq = new HashMap<>();

		for (int x : arr) {

			freq.put(x, freq.getOrDefault(x, 0) + 1);

		}

		for(Map.Entry<Integer,Integer> x : freq.entrySet()) {
			
			System.out.print(x.getKey() + "->" + x.getValue());
			System.out.println();
		}
	}

}
