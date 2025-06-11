package tpdf1;

import java.util.Arrays;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr= {0,1,0,0,1,0,1,0,1};
		int i=0,j=1;
		while(i<arr.length && j<arr.length) {
			
			if(arr[i]==0 && arr[j]==1) {
				arr[i]=1;
				arr[j]=0;
				i++;
				j++;
			}
			else if( arr[i]!=0) i++;
			else if(arr[j]!=1) j++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
