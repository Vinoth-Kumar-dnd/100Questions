package tpdf1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Question12 {

	static Set<String>res=new TreeSet<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="aabc";
		
		char[]arr=str.toCharArray();
		
		boolean visited []=new boolean[str.length()];
		
		helper(arr,visited,new StringBuilder(),str);
		
		System.out.println(res);

	}

	private static void helper(char[] arr, boolean[] visited, StringBuilder stringBuilder, String str) {
		
		if(stringBuilder.length()== str.length() ) {
			res.add(stringBuilder.toString());
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			
			if(visited[i]) continue;
			
			stringBuilder.append(arr[i]);
			visited[i]=true;
			helper(arr, visited, stringBuilder, str);
			stringBuilder.deleteCharAt(stringBuilder.length()-1);
			visited[i]=false;
		
			
		}
		return;
		
	}

}
