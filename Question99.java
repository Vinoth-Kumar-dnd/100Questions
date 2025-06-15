package tpdf2;

public class Question99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=100;
		
		int start = (int)Math.ceil(Math.sqrt(a));
        int end = (int)Math.floor(Math.sqrt(b));
        
        for(int i=start;i<=end;i++) {
        	System.out.print((i*i)+ " ");
        }
	}

}
