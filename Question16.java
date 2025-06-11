package tpdf1;

public class Question16 {

	public static void main(String[] args) {
		
		int a=-8;
		int b=-4;
		
		System.out.println("Sum :"+sum(a,b));
		System.out.println("Difference :"+difference(a,b));
		System.out.println("Multiplication :"+multiplication(a,b));
		System.out.println("Division :"+division(a,b));
		
	}

	private static int division(int a, int b) {
		int ans=0;
		boolean minus =false;
		if(a<0 && b>0) {
			minus=true;
		}
		if(a>0 && b<0) {
			minus=true;
		}		
		a =Math.abs(a);
		b = Math.abs(b);
		int rem = a%b;
		
		 a -=rem;
		
		 while(a !=0) {
			 a -= b;
			 ans++;
		 }
		 
		return minus ? -ans : ans;
		
		
	}

	private static int multiplication(int a, int b) {
		boolean minus =false;
		if(a<0 && b>0) {
			minus=true;
		}
		if(a>0 && b<0) {
			minus=true;
		}	
		a =Math.abs(a);
		b = Math.abs(b);
		int ans=0;
		for(int i=0;i<b;i++) {
			ans += a;
		}
		return minus ? negate(ans) : ans;
	}

	private static int difference(int a, int b) {


		return a+ negate(b);
		
	}

	private static int negate(int b) {
	
	    int neg = ~b+1;
		return neg;
	}

	private static int sum(int a, int b) {
	
		return a+b;
		
	}

}
