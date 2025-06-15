package tpdf2;

public class Question36 {

	public static void main(String[] args) {
	
		
//		String s1="Spoon";
//		String s2="Sp*n";
//		String s1="man";
//		String s2="n*";	
		String s1="subline";
		String s2="line";	
		int i=0,j=0;
		int st=-1;
		int match=-1;
		
		if(s1.contains(s2)) {
			System.out.print(true);
		}
		else {
		while(i<s1.length() && j<s2.length()) {
			
			if(s1.charAt(i)==s2.charAt(j)) {
				i++;
				j++;
			}
			else if(i<s1.length() && s2.charAt(j)=='*') {
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
				
				break;
			}
			
		}
		
		
		if(s2.charAt(s2.length()-1)=='*') {
			while(i<s1.length())
				i++;
		}
		
		if(i==s1.length() && j==s2.length()) {
			System.out.print(true);
		}
		else {
			System.out.print(false);
		}
		}

	}

}
