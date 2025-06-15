package tpdf2;

public class Question51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1= {1,3,4,5};
		int[]arr2= {0,2,7,8};
		
		mergeArr(arr1,arr2);

	}

	private static void mergeArr(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		int n=arr1.length;
		int m=arr2.length;
		
		for(int i=0;i<n;i++) {
			
			if(arr1[i] > arr2[0]) {
				int temp=arr1[i];
				arr1[i]=arr2[0];
				arr2[0]=temp;
			}
		
		int firstele =arr2[0];
		
		int k;
		
		for(k=1;k<m && arr2[k] < firstele;k++) {
			
			arr2[k-1]=arr2[k];
		}
		arr2[k-1]=firstele;
		}
	

	for(int i=0;i<n;i++) {
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	for(int i=0;i<m;i++) {
		System.out.print(arr2[i]+" ");
	}	
	}
}
