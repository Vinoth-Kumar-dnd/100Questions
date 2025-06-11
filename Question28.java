package tpdf1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []arr = {10,22,15,21};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		
		for(int i=0;i<arr.length;i++) {
			int fac = findFactor(arr[i]);
			map.put(arr[i], fac);
		}
		List<Map.Entry<Integer,Integer>> res = new ArrayList<>(map.entrySet());
		res.sort((a,b) -> {int k=a.getValue()-b.getValue() ;
		if(k!=0) return k;
		
		return a.getKey()-b.getKey();		} );
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(res.get(i).getKey() + " "+ res.get(i).getValue());
		}

	}

	private static int findFactor(int n) {
	
		for(int i=2;i*i<=n;i++) {
			
			if(n%i==0) {
				return i;
			}
		}
		
		return n;
	}

}
