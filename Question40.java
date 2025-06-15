package tpdf2;

import java.util.Arrays;

public class Question40 {
    static boolean pathFound = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][]path= {{'1','1','0','0'},
				{'1','0','0','0'},
				{'1','1','1','1'},
				{'1','0','0','1'}};
		
		boolean visited[][]=new boolean[path.length][path.length];
		visited[0][0] = true;
        path[0][0] = '_';
		findPath(path,0,0,visited);
		
	for(char[] s:path) {
		System.out.println(Arrays.toString(s));
	}

	}

	private static void findPath(char[][] path, int i, int j,boolean[][]visited) {
		// TODO Auto-generated method stub
		if(i==path.length-1 && j == path.length-1) {
			pathFound=true;
			return;
		}
		
		int[]row= {-1,0,0,1};
		int[]col= {0,-1,1,0};
		
		for(int k=0;k<4;k++) {
			
			int nrow=i+row[k];
			int ncol=j+col[k];
			
			if(isValid(nrow,ncol,visited,path)) {
				
				visited[nrow][ncol]=true;
				path[nrow][ncol]='_';
				
				findPath(path,nrow,ncol,visited);
				if(pathFound) return;
                path[nrow][ncol] = '1';
                visited[nrow][ncol] = false;				
				
			}
			
		}
		return;

		
	}

	private static boolean isValid(int nrow, int ncol, boolean[][] visited,char[][]path) {
	   if(nrow >= 0 && nrow < visited.length && ncol >=0 && ncol < visited.length && 
			   !visited[nrow][ncol] && path[nrow][ncol]=='1' )
		   return true;
		
		return false;
	}

}
