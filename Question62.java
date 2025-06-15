package tpdf2;

public class Question62 {
    static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=10;
	
	int root = (int)Math.sqrt(n);
	
		for(int i=1;i<=root;i++) {
			findAns(i,n,0,root);
		}
System.out.println(count);
	}

	private static void findAns(int i, int n,int sum,int r) {
		
		if(sum==n) {
			count++;
			return;
		}
		if(sum>n) {
			return;
		}
		
		for(int k=i;k<=r;k++) {
			sum+=k*k;
			findAns(k,n,sum,r);
			  sum -= k * k;
		}
		
		return;
		
	}

}
