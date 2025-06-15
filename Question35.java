package tpdf2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 2, 3, 4, 5, 12, 2, 3, 3, 3, 12, 1, 1, 1 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int x : arr) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> res = new ArrayList<>(map.entrySet());

		res.sort((a, b) -> {
			int k = b.getValue() - a.getValue();
			if (k != 0)
				return k;
			return a.getKey() - b.getKey();
		});

//		for(int i=0;i<res.size();i++) {
//			
//			for(int j=0;j<res.get(i).getValue();j++) {
//				System.out.print(res.get(i).getKey()+" ");
//			}
//		}
		
		
		//Question 37
		
		int value = 0;
		for (int i = 0; i < res.size() - 1; i++) {

			if (res.get(i).getValue() != res.get(i + 1).getValue()) {
				value = res.get(i + 1).getValue();
				break;
			}
		}

		if (value != 0) {
			for (int i = 0; i < res.size() - 1; i++) {

				if (res.get(i).getValue() == value) {
					System.out.print(res.get(i).getKey() + " ");

				}
			}

		}
	}

}
