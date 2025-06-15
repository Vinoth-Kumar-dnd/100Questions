package tpdf2;

public class Question97 {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=120;
		String s =Integer.toString(num);
		
		findAns(num,s,0);
		System.out.println(count);

	}
	private static void findAns(int num, String s,int idx) {
		
		if(num==0) {
			count=idx;
			return;
			
		}
		
		StringBuilder sb=new StringBuilder();
		
				for(int i=0;i<s.length();i++) {
			
			if( s.charAt(i) > '1') {
				
				
				sb.append('1');
			}
			else {
				
				sb.append(s.charAt(i));
				
				
			}
			
		
				}
				//System.out.println(sb.toString());
				//count++;
				num =num-Integer.parseInt(sb.toString());
				//System.out.println(num);
				String d=Integer.toString(num);
				//System.out.println(s);
				findAns(num,d,idx+1);
	
		return;
	}

}
