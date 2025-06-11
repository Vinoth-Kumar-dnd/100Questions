package tpdf1;

public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2863;
		int n=4;
		
		
        printAns(num,n);

	}

	private static void printAns(int num, int n) {
		// TODO Auto-generated method stub
		if(num ==0) {
			return;
		}
		int temp =num%10;
		printAns(num/10, n);
		System.out.print(temp+n);
		
		
	}

}
