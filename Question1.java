package tpdf1;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="abcd";
		String b="a?bcd";
		
		int i=0;
		int j=0;
		int st=-1;
		int match=-1;
		
		while(i< a.length()) {
			
			
			if(j< b.length() && (a.charAt(i)==b.charAt(j) || b.charAt(j)=='?')) {
				
				i++;
				j++;
			}
			
			else if(j< b.length() && b.charAt(j)=='*') {
				
				st=j;
				
				match=i;
				j++;
			}
			else if(st != -1) {
				j=st+1;
				match++;
				i=match;
			
			}
			else {
//				System.out.println(false);
				break;
			}
			
			
		}
		
		while(j< b.length() && b.charAt(j)=='*') {
			j++;
		}

		System.out.println(j==b.length());
	}

}
