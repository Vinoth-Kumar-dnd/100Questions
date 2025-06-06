package tpdf1;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="he knows malayalam";
		
		String[]arr=str.split(" ");
		
		for(String word : arr) {
			if(isPalindrom(word)) {
				System.out.print(word+" ");
			}
		}

	}

	private static boolean isPalindrom(String word) {

		int len=word.length();
		
		if(len==1) return true;
		
		int i=0;
		int j=len-1;
		int mid =len/2;
		while(i<=mid && j>=mid) {
			if(word.charAt(i) != word.charAt(j)) return false;
			i++;
			j--;
		}
		
		return true;
		
		
	}

}
