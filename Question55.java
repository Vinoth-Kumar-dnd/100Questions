package tpdf2;

public class Question55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		// nC0

		for (int i = 0; i < n; i++) {
			int val = 1;
			System.out.print(val + " ");
			for (int k = 1; k <= i; k++) {
				val = val * (i - k + 1) / k; //  i=1-> val=1*(1-1+1)/1
				System.out.print(val + " ");//   i=2 -> val = 1*(2-1+1)/1 => 2 val =2*(2-2+1)/2  
			}                               //  i=4,k=2 -> val = 4*(4-2+1)/2 => 12/2 => 6
			System.out.println();
		}

	}

}
