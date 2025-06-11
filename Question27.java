package tpdf1;

public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int i = 1;

		while (n != 0) {
			i++;
			boolean prime = true;
			for (int k = 2; k <= (i / 2); k++) {
				if (i % k == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(i);
				n--;
			}

		}

	}

}
