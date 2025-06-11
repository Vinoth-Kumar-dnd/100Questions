package tpdf1;

import java.util.Arrays;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 4, 5, 6, 7, 9, 8, 7, 4, 4 };
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
		int n = arr.length;
		int i = 0;
		int j = n-1;
        while(i<j) {
        	if(arr[i]%2==0) {
        		rotate(arr,i,n,j);
        		
        		j--;
        	}
        	i++;
        }
        System.out.println(Arrays.toString(arr));
	}

	private static void rotate(int[] arr, int i, int n, int j) {
		// TODO Auto-generated method stub
		
		int temp=arr[i];
		
		for(int k=i;k<j;k++) {
			arr[k]=arr[k+1];
		}
		arr[j]=temp;
		
	}

	private static void heapSort(int[] arr) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--) {

			heapify(arr, i, n);
		}

		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, 0, i);
		}

	}

	private static void heapify(int[] arr, int i, int n) {
		// TODO Auto-generated method stub

		int largest = i;

		int l = (2 * i) + 1;
		int r = (2 * i) + 2;

		if (l < n && arr[l] > arr[largest]) {
			largest = l;
		}
		if (r < n && arr[r] > arr[largest]) {
			largest = r;
		}

		if (largest != i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;

			heapify(arr, largest, n);
		}

	}

}
