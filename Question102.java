package tpdf2;

public class Question102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=6;
		
		for(int i=0;i<=n;i++) {
			
			int k=n;
			int start=i+1;
			for(int j= 0 ;j<(n-i);j++) {
				
	            System.out.print(start+" ");
	            start += k;
				
			k--;
			}
			System.out.println();
		}
	}

}
