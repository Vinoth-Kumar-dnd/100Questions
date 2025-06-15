package tpdf2;

public class Question34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 21, 7 };
		int[] div = { 11, 5 };

		int ans = -1;
		int k = 0;
		while (k < arr.length) {
			for (int i = 1; i < 1000; i++) {
				boolean prime = true;
				for (int j = 2; j * j < i; j++) {

					if (i % j == 0) {
						prime = false;
						break;
					}
					if (i == 1)
						prime = true;
				}
				if (prime) {
					if ((arr[k] + i) % div[k] == 0) {
						ans = i;
						break;
					}
				}

			}
			System.out.println(ans);
			k++;
			ans = -1;
		}
	}

}
