package tpdf1;

public class Question18 {

	public static void main(String[] args) {
	
		
		int[]date1= {10,2,2014};
		int[]date2= {10,3,2015};
//		int[]date1= {10,2,2000};
//		int[]date2= {10,3,2000};	
		
//		int[]date1= {1,2,2000};
//		int[]date2= {1,2,2004};
		
//		int[]date1= {10,2,2014};
//		int[]date2= {12,2,2014};
     	int days=0;


		
		if(date1[1]==date2[1] && date1[2]==date2[2]) {
			days = date2[0]-date1[0];
		}
		
		
		else if(date1[2]==date2[2]) {
			
			days += monthDays(date1[1],date1[2],date2[1]-1);	
			
			days += date2[0]-1;
			days += currentMonthDays(date1[0],date1);
		}
		else {
			
		
	
	
		int years = date2[2]-date1[2]-1;
	
		for(int i=1;i<=years;i++) {
		
			if(isLeapyear(date1[2]+i)) {
				days += 366;
			}
			else {
				days += 365;
			}
			
		}

		days += monthDays(date1[1],date1[2],12);
	
		days += monthDays(0,date2[2]-1,date2[1]-1);
		
		days += date2[0]-1;
		days += currentMonthDays(date1[0],date1);
		
		}

		System.out.println(days);

		
		
	}
	

	
	

	private static int currentMonthDays(int i,int[]date1) {
		int k=i;
		int days=0;
		if(k==2 ) {
			if(isLeapyear(date1[2])) {
				days += (29-(k));
			}
			else{
				days+= (28-(k));
			}
		}
		else if(k % 2 ==1) {
			days += (31-(k));
		}
		else {
			days += (30-(k));
		}
		return days;
	}





	private static int monthDays(int k, int year,int end) {
		int ans=0;

		for(int i=(k+1);i<=end;i++) {
			if(i==2 ) {
	             ans +=  isLeapyear(year) ? 29 : 28;
			}
			else if(i % 2 ==1) {
				ans +=31;
			}
			else {
				ans +=30;
			}
		}
		
		return ans;
	}

	private static boolean isLeapyear(int year) {

		if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
			return true;
		}
		return false;
		
	}

}
