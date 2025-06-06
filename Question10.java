package tpdf1;

public class Question10 {

	public static void main(String[] args) {
	
		String one = "expneriEncEe";
		
		String two ="En";
		
		for(char s : one.toCharArray()) {
			
			if(two.indexOf(s) < 0) {
				System.out.print(s);
			}
		}

	}

}
