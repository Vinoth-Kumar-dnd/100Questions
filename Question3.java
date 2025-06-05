package tpdf1;

public class Question3 {

	public static void main(String[] args) {
		
		
		int n=4;
		int k=0;
		int prev=1;
		for(int i=1;i<=n;i++) {
		
			int space = n-i;
			
			for(int s=0;s<space;s++) {
				System.out.print(" ");
			}
			
			k+=i;
			for(int j =k;j>=prev;j-- ) {
				System.out.print(j+" ");
			}
			prev=k+1;
			System.out.println();
		}
		
		prev--;
		
		for(int i=n;i>0;i--) {
			
			int space =n-i;
			for(int s=0;s<space;s++) {
				System.out.print(" ");
			}
			
			k-=i;
			
			for(int j=prev ;j>k;j--) {
				System.out.print(j+" ");	
			}
			
			prev=k;
			System.out.println();
			
			
		}
		
		

	}

}
