package tpdf2;

import java.util.ArrayList;
import java.util.List;

public class Question108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num="3";
		String num1="4";
		
		List<String>arr=new ArrayList<>();
		
		arr.add(num);
		arr.add(num1);
		
		
	
		int n=10;
		int k=0;
		while(arr.size()<10) {
			
			int size=arr.size();
			
			for(int i=k;i<size;i++) {
				
				
				StringBuilder sb =new StringBuilder(arr.get(i));
				StringBuilder cb =new StringBuilder(arr.get(i));
				sb.append("3");
				cb.append("4");
				arr.add(sb.toString());
				arr.add(cb.toString());
			}
			k=size;
		}
		
		System.out.print(arr.get(n-1));

	}

}
