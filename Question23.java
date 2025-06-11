package tpdf1;

public class Question23 {

	public static void main(String[] args) {
		
		int arr[]= {1, 2, 3, 7, 6};
		int i=0;
		int j=arr.length-1;
		
		int sum=0;
		int sum1=0;
		while(i!=j) {
			
			
		
			
			if(sum <= sum1) {
				sum+=arr[i];
				i++;
			}
			else {
				sum1 +=arr[j];
				j--;
			}
			
		}
		System.out.println(sum +" "+ sum1 + " "+ arr[i]);

	}

}
