package tpdf2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Question107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String exp="((abc)((de))";
		String exp="(((av()))()";
		
		
		Stack<Integer>st =new Stack<>();
		List<Integer>idx=new ArrayList<>();
		for(int i=0;i<exp.length();i++) {
			
			if(exp.charAt(i)=='(') {
				st.push(i);
			}
			
			else if(exp.charAt(i)==')') {
				if(st.isEmpty()) {
					idx.add(i);
				}
				else {
					st.pop();
				}
				
			}
		}
		
		while(!st.isEmpty()) {
			idx.add(st.pop());
		}
		
		
		for(int i=0;i<exp.length();i++) {
			
			if(idx.contains(Integer.valueOf(i))) {
				continue;
			}
			System.out.print(exp.charAt(i));
		}
		

	}

}
