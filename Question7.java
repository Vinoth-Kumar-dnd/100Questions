package tpdf1;

public class Question7 {

	
	public static void main(String[]args) {
		
		String s1="asdfghij";
		String s2="adsfgijh";
		
		int i=0;
		int j=0;
		boolean match=true;
while(j<s1.length() ) {
	
	if(s1.charAt(j)==s2.charAt(j)) {

		
		if(!match) {
			System.out.println(s1.substring(i,j)+ "-"+s2.substring(i,j));
			match=true;
		}
		
		i++;
		j++;
	}
	else {
		if(match) i=j;
		j++;
		match=false;
	}
}
if(!match && i< s1.length()) {
	System.out.println(s1.substring(i,j)+ "-"+s2.substring(i,j));
}
	}
	
}
