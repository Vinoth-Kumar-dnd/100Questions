package tpdf1;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="he knows malayalam racecar";
		
		String[]arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			
			if(!palindrome(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}

	}

	private static boolean palindrome(String string) {
	
		int mid=string.length()/2;
		
		int i=mid-1;
		int j = (string.length() %2 ==1) ? mid+1 : mid;
		
		while(i>=0) {
			if(string.charAt(i) != string.charAt(j)) {
				return false;
				
			}
			i--;
			j++;
		}
		
		return true;
		
	}

}
