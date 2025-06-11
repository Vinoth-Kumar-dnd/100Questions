package tpdf1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Question14 {

	public static void main(String[] args) {
	
		int []arr= {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int x : arr) {
			
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		List<Entry<Integer,Integer>> freq = new ArrayList<>(map.entrySet());
		
		freq.sort((a,b) -> b.getValue()-a.getValue() );
		
		for(int i=0;i<3;i++) {
			
			System.out.println(freq.get(i).getKey());
		}

	}

}
