package tpdf1;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "guhan";
		int n=s.length();
		for(int i=0;i<s.length();i++) {
			
			for(int j=0;j<s.length();j++) {

			if( i==j) {
				System.out.print(s.charAt(j));
			}
			else if( j== n-i-1) {
				System.out.print(s.charAt(n-i-1));
			}

			else {
				System.out.print(" ");
			}


			}
			System.out.println();
		}

	}

}
