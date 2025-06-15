package tpdf2;

import java.util.HashSet;
import java.util.Set;

public class Question56 {

	public static void main(String[] args) {
	
		
		int row=4;
		int col=3;
		
		int [][]arr= new int[][] {{1,0,1},{1,0,1},{1,0,1},{1,0,1}};
		
		Set<Integer> bin =new HashSet<>();
		
		for(int[] a : arr) {
			int num=0;
			for(int i=0;i<col;i++) {
				
				num += 1 * Math.pow(2, a[i]);
			}
			
			if(!bin.contains(num)) {
				bin.add(num);
				for(int i=0;i<col;i++) {
					
					System.out.print(a[i]+" ");
				}				
			}
		}
		
		

	}

}
