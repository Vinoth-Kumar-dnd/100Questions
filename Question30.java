package tpdf1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<String> arr = new ArrayList<>(Arrays.asList("22","44","245"));
	
	arr.sort((a,b) -> (b+a).compareTo(a+b));
	
	for(String s: arr) {
		System.out.print(s);
	}

	}

}
