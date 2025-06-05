package tpdf1;

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {0, 2,0, 2,0, 2, 0, 6, 6, 0, 8};
		
		for(int i=1;i<(arr.length-1);i++) {
			if(arr[i]==arr[i-1]) {
				arr[i-1]=2*arr[i];
				arr[i]=0;
			}
		}

		int i=0;
		int j=1;
		
		while(i<arr.length && j < arr.length) {
			if(arr[i]==0 && arr[j] !=0) {
				arr[i]=arr[j];
				arr[j]=0;
				i++;
				j++;
			}
			else if(arr[j]==0) {
				j++;
			}
			else if(arr[i]!=0) {
				i++;
			}
		}
		
	System.out.println(Arrays.toString(arr));
	}

}
