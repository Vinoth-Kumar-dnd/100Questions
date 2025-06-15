package tpdf2;

public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		
		int[][]b=new int[n][n];
		if(nQueen(b,0,n)) {
			
			for(int[]a : b) {
				for(int x :a) {
					System.out.print(x+" ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Not possible");
		}

	}

	private static boolean nQueen(int[][] b, int i, int n) {
	
		if(n==0) return true;
		
		for(int j=0;j<b.length;j++) {
              if(isvalid(i,j,b)) {
      			b[i][j]=1;
    			if(nQueen(b, i+1, n-1)) {
    				return true;
    			}
    			b[i][j]=0;
              }
			
		}
		
		return false;
	}

	private static boolean isvalid(int i, int j, int[][] b) {

		
		for(int x=0 ; x<i;x++) {
			if(b[x][j]==1) return false;
		}
		
		for(int x=i-1,y=j-1 ;x>=0&&y>=0 ;x--,y--) {
			if(b[x][y]==1) return false;
		}
		for(int x=i-1,y=j+1 ;x>=0&&y<b.length ;x--,y++) {
			if(b[x][y]==1) return false;
		}		
		return true;
	}

}
