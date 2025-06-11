package tpdf1;

public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pal = "vinotaaaaracecaraaaahwater";
		char []word = pal.toCharArray();
		int n=pal.length();
		int ans=1;
		for(int i=1;i<n-1;i++) {
			
		ans = Math.max(checkpal(word,i),ans);	
		}
System.out.println(ans);
	}

	private static int checkpal(char[]word, int idx) {
		int i;
		int j;
		int count=0;
		if(word[idx-1]==word[idx+1]) {
			i=idx-1;
			j=idx+1;
			count=1;
			
		}
		else if(word[idx-1]==word[idx]) {
			i=idx-1;
			j=idx;
		}
		else if(word[idx+1]==word[idx]) {
			i=idx;
			j=idx+1;
		}
		else {
			return 0;
		}
		
		
		while(i>=0 && j< word.length) {
			
			if(word[i]==word[j]) {
				i--;
				j++;
				count+=2;
			}
			else {
				break;
			}
			
		}
		
		return count;
		
	}

}
