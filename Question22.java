package tpdf1;

import java.util.HashMap;
import java.util.Map;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]arr= {"catch", "got", "tiger", "mat", "eat", "Pat", "tap", "tea"};
		
		String str ="ate";
		

		
		for( String s : arr) {
			Map<Character,Integer> map = new HashMap<>();
			for(char a : s.toCharArray()) {
				map.put(a, map.getOrDefault(a, 0)+1);
			}
			for(char a : str.toCharArray()) {
				if(!map.containsKey(a)) break;
				
				map.put(a, map.get(a)-1);
				
				if(map.get(a)==0) map.remove(a);
			}
			if(map.size()==0) {
				System.out.println(s);
			}
		}

	}

}
