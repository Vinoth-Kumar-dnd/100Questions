package tpdf2;

import java.util.HashSet;
import java.util.Set;

public class Question64 {

	public static void main(String[] args) {
	
		
		int n=34;
		Set<Integer>set=new HashSet<>();
		boolean notfound=true;
		for(int i=n-2;i>=2;i--) {
			
			if(prime(i)) {
				
				int need = n-i;
				
				if(set.contains(need) ) {
					System.out.println("yes");
					notfound=false;
					break;
				}
				set.add(i);
			}
		}
		if(notfound) {
			System.out.println("No");
		}

	}

	private static boolean prime(int n) {
	
		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
