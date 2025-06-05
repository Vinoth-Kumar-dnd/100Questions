package tpdf1;

import java.util.ArrayList;
import java.util.List;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {2,4,6,9};
		int[]num = {1,2,4,6,7,9};
		
		int prev=Integer.MIN_VALUE;
		
		int i=0;
		int j=0;
		
		List<Integer> ans = new ArrayList<>();
		
		while(i<arr.length || j < num.length) {
			
			int val=0;
			
			if(i<arr.length &&(j >= num.length || arr[i] <= num[j]) ) {
				
				val=arr[i];
				i++;
			}
			else if (j < num.length && (i >= arr.length ||  arr[i] > num[j])) {
				
				val=num[j];
				j++;
			}
			
			if(val != prev || prev == Integer.MIN_VALUE) {
				
				ans.add(val);
				prev=val;
			}
				
		}
		
		System.out.print(ans);
		
		
		
		

	}

}
