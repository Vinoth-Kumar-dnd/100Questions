package tpdf2;

public class Question39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		
		for(int i=0;i<Math.pow(2, n);i++) {
		String s="";
			for(int j=0;j<n;j++) {
				
				int a =(i>>j)&1;
				s = ""+(char)( a+'0')+s;
				
			}
			System.out.println(s);
			
		}
	}

}
