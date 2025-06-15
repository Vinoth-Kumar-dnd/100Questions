package tpdf2;

import java.util.ArrayList;
import java.util.List;

public class Question90 {
    static List<String> combperm = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";

		List<String> comb = comb(s);
		
		for(String str:comb) {
			if(str.length()>1) {
				perm(str);
			}
			else {
				combperm.add(str);
			}
		}

	}

	private static void perm(String str) {

		
	}

	private static List<String> comb(String s) {

		List<String> res = new ArrayList<>();

		res.add("");

		for (int i = 0; i < s.length(); i++) {

			int size = res.size();

			for (int j = 0; j < size; j++) {
                
				StringBuilder sb = new StringBuilder(res.get(j));
				sb.append(s.charAt(i));
				res.add(sb.toString());
			}
		}
		return res;
	}

}
