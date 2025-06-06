package tpdf1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr = {6, 3, 9, 10, 8, 2, 1, 15, 7};

	        
		int[]arr1 = Arrays.copyOf(arr, arr.length);
		
		heapSort(arr1);
	
		List<Integer> num = new ArrayList<>();
		   
        for (int val : arr1) {
            num.add(val);
        }
		for(int i=0;i<arr.length;i++) {
			
			int index = num.indexOf(arr[i]);
			
			if((index+1) < num.size()) {
				
				System.out.print(num.get(index+1)+" ");
			}
			else {
				System.out.print("_ ");
			}
		}

	}

	private static void heapSort(int[] arr) {
	
		
		int len = arr.length;
		
		for(int i=len/2-1 ; i>=0;i--) {
			heapify(arr,len,i);
		}
        for (int i = len - 1; i > 0; i--) {

           
            int temp = arr[0]; 
            arr[0] = arr[i];
            arr[i] = temp;

      
            heapify(arr, i, 0);
        }		
		
	}

	private static void heapify(int[] arr, int len, int i) {
		
		int largest=i;
		
		int l= (2*i)+1;
		int r=(2*i)+2;
		
		if(l<len && arr[l] > arr[largest]) {
			largest=l;
		}
		if(r<len && arr[r]> arr[largest]){
			largest=r;
		}
		
		if(largest != i) {
			
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,len,largest);
		}
		
	}

}
