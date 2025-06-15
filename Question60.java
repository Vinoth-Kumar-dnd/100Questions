package tpdf2;

import java.util.ArrayList;
import java.util.List;

public class Question60 {
	static String ans="";
	
	static int target=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int arr[]= {99,8,999,97};
		int [] arr ={1, 4, 89, 73, 9,7};		
		
		List<String>num = new ArrayList<>();
		
		for(int x : arr) {
			num.add(Integer.toString(x));
		}
		
		num.sort((a,b)-> (b+a).compareTo(a+b));

//		for(String x:num) {
//			System.out.print(x);
//		}
		

	
	for(int i=0;i<num.size();i++) {
		findAns(num,new StringBuilder(),i);
	}

	System.out.println(ans);	
	}
	private static void findAns(List<String> num, StringBuilder cb,int idx) {
	

		if(cb.length()==target) {
			
			if((cb.toString().compareTo(ans))>0) {
				ans=cb.toString();
			}
			return;
		}

		if(idx > num.size()) return;
		

		
		for(int i=idx;i<num.size();i++) {
			cb.append(num.get(i));
			findAns(num, cb, idx+1);
			
			if(cb.length()> target) {
				cb.delete(cb.length()-num.get(i).length(),cb.length());
			}
		}
		
		return;
		
	}

}
