package tpdf2;

public class Question98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man, in the boat says : I see 1-2-3 in the sky";
		StringBuilder sb= new StringBuilder(s);
		
		int i=0;
		int j=s.length()-1;
		
		while(i<j) {
			
			if(Character.isLetter(sb.charAt(i)) && Character.isLetter(sb.charAt(j))) {
				
				char temp=sb.charAt(i);
				
				sb.setCharAt(i, sb.charAt(j));
				sb.setCharAt(j,temp);
				i++;
				j--;
			}
			if(!Character.isLetter(sb.charAt(i)) ) {
				i++;
			}
			if(!Character.isLetter(sb.charAt(j)) ) {
				j--;
			}
			
		}
		System.out.println(sb.toString());
	}

}
