package tpdf1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question13 {

	static List<Integer> res = new ArrayList<>();
	
	public static void main(String[] args) {
		int num=12345;
		
		String val = Integer.toString(num);
		int[]arr= new int[val.length()];
		
		int k=val.length()-1;
		while(num > 0) {
			arr[k--]=num%10;
			num = num/10;
			
		}
		
	//	System.out.println(Arrays.toString(arr));
		
		findNextPal(arr);

	}

	private static void findNextPal(int[] arr) {
		
		if(all9(arr)) {
			res.add(1);
			
			for(int i=0;i<arr.length;i++) {
				res.add(0);
			}
			
			res.add(1);
		}
		else {
			
			nextPal(arr);
			for(int i=0;i<arr.length;i++) {
				res.add(arr[i]);
			}
			
			System.out.print(res);
		
			
			
		}
	
		
	
	}
	
	
	

	private static void nextPal(int[] arr) {
	
		int n=arr.length;
		
		int mid =n/2;
		
		int i=mid-1;
		
		int j= (n/2)==1 ? mid+1 : mid;
		
		while(i >= 0 && arr[i]==arr[j]) {
			i--;
			j++;
		}
		
		boolean smallLeft=false;
		if(i < 0 || arr[i] < arr[j]) smallLeft=true;
		
		while(i >= 0) {
			arr[j]=arr[i];
			i--;
			j++;
		}
		//System.out.println(Arrays.toString(arr));
		if(smallLeft) {
			
			i= mid-1;
			int carry=1;
			
			if(n%2==1) {
				arr[mid]+=carry;
				carry = arr[mid]/10;
				arr[mid] %= 10;
				j=mid+1;
				
			}
			else {
				j=mid;
			}
			//System.out.println(Arrays.toString(arr));
			while(i >=0) {
				
				arr[i] += carry;
				
				carry = arr[i]/10;
				arr[i] %= 10;
				 arr[j++]= arr[i--];
				//System.out.println(Arrays.toString(arr));
			}
			
					
		}
		

		
		
		
	}

	private static boolean all9(int[] arr) {
		
		for(int a : arr) {
			if(a != 9) {
				return false;
			}
		}
		return true;
	}

}
