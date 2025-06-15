package tpdf2;

public class Question96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=101;
		int ans=0;
		for(int i=1;i<=n;i++) {
			
			ans += Integer.toString(i).length();
		}
System.out.println(ans);
	}

}
