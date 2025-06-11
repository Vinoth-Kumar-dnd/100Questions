package tpdf1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String num ="1221";
		
		List<String> arr = new ArrayList<>();
		
		helper(num,new StringBuilder(),0,arr);
		
		System.out.println(arr);
		
		
		
		
		

//		String num = "1221";
//		int count = 1;
//		for (char x : num.toCharArray()) {
//			System.out.print((char) ((x - '0') + ('A' - 1)));
//		}
//		System.out.println();
//		Set<String> set = new HashSet<>();
//
//		for (int i = 0; i < num.length(); i++) {
//			StringBuilder sb = new StringBuilder();
//			for (int j = 0; j < num.length(); j++) {
//
//				if (j == i)
//					sb.append((char) ((num.charAt(j) - '0') + ('A' - 1)));
//
//				else if (j + 1 < num.length()) {
//
//					int s = Integer.parseInt("" + num.charAt(j) + num.charAt(j + 1));
//
//					char c = (char) ('A' + s - 1);
//					sb.append(c);
//					j++;
//
//				} else {
//					int s = Integer.parseInt("" + num.charAt(j));
//					char c = (char) ('A' + s - 1);
//					sb.append(c);
//				}
//
//			}
//
//		   set.add(sb.toString());
//		
//
//		}
//		   System.out.println(set);
	}

	private static void helper(String num, StringBuilder sb, int i, List<String> arr) {
		// TODO Auto-generated method stub
		
		if(i == num.length()) {
			arr.add(sb.toString());
			return;
		}
		
		
		int a = num.charAt(i) -'0';
		if(a>=1 && a<=9) {
			sb.append((char)(a+'A'-1)) ;
			helper(num, sb, i+1, arr);
			sb.deleteCharAt(sb.length()-1);
		}
		
		if((i+2) <= num.length()) {
			
			int b = Integer.parseInt(num.substring(i,i+2));
			if(b>9 && b<=26) {
				sb.append((char)(b+'A'-1)) ;
				helper(num, sb, i+2, arr);
				sb.deleteCharAt(sb.length()-1);
			}
			
		}
		
	}

}
