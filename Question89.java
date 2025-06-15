package tpdf2;

import java.util.HashMap;
import java.util.Map;

public class Question89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> num = new HashMap<>();
		
		num.put('I', 1);

		num.put('V', 5);
		num.put('X', 10);
		num.put('L', 50);
		num.put('C', 100);
		num.put('D', 500);
		num.put('M', 1000);
		
		
		String roman="MCMIV";
		
		int res=0;
		for(int i=roman.length()-2;i>=0;i--) {
			
			int a=num.get(roman.charAt(i));
			int b=num.get(roman.charAt(i+1));
		
			
			if(a>=b) {
				res += a+b;
			}
			else {
				res += b-a;
				
			}
			i--;
			
		}
		if(roman.length()%2 !=0) {
			res += num.get(roman.charAt(0));
		}
		
		System.out.println(res);

	}

}
