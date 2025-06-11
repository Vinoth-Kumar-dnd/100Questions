package tpdf1;

import java.util.HashMap;
import java.util.Map;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> keypad = new HashMap<>();
		
		
		keypad.put( "abc",2);
		keypad.put( "def",3);
		keypad.put( "dhi",4);
		keypad.put( "jkl",5);
		keypad.put( "mno",6);
		keypad.put( "pqrs",7);
		keypad.put( "tuv",8);
		keypad.put("wxyz",9);
		
		
		String word ="abc";
		
		for(char x: word.toCharArray()) {
			
			for(String a : keypad.keySet()) {
				
				if(a.indexOf(x)>0) {
					int val = keypad.get(a);
					for(int i=0;i<=a.indexOf(x);i++) {
						System.out.print(val);
					}
				}
			}
			
		}
		
		

	}

}
