package tpdf2;

public class Question100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 8, 10, 13, 6, 2 };
		int n = 3;

		int res = 0;

		for (int i : arr) {
			if (i % n == 0) {
				res += i / n;
			} else {
				res += i / n;
				res++;
			}

		}
		System.out.println(res);

	}

}
