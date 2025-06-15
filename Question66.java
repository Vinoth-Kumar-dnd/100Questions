package tpdf2;

import java.util.Arrays;

public class Question66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []wt= {3, 2, 5, 7};
        int []val= {2, 3, 4, 5};
        int w=9;
        int ans = findAns(wt,val,w);
        System.out.println(ans);
	}

	private static int findAns(int[] wt, int[] val, int w) {
		
		int [][]dp=new int[val.length+1][w+1];
		int max=Integer.MIN_VALUE/2;
		for(int []a:dp) {
			Arrays.fill(a, max);
		}
		for(int i=0;i<=val.length;i++) {
			dp[i][0]=0;
		}
		
		for(int i=1;i<=val.length;i++) {
			for(int j=0;j<=w;j++) {
				
				
				
				if(j>=wt[i-1]) {
					dp[i][j]=Math.max(dp[i-1][j], val[i-1]+dp[i-1][j-wt[i-1]]);
				}
				else {
					dp[i][j]=dp[i-1][j];	
				}
			}
		}
		
		
		return dp[val.length][w];
	}

}
