package tpdf2;

import java.util.Arrays;
import java.util.Scanner;

public class Question45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k=0;
		int arr[]=new int[4];
		int [][]pts= {{2,2},{3,2},{2,4},{3,4}};
		for(int i=0;i<4;i++) { // 2,2  3,2
			int a=pts[i][0];
			int b=pts[i][1];

			
			
			
			
			
			
		}
		Arrays.sort(arr);
//		public class ShapeIdentifier {
//
//		    static class Point {
//		        int x, y;
//		        Point(int x, int y) {
//		            this.x = x;
//		            this.y = y;
//		        }
//		    }
//
//		    // Helper to calculate squared distance between two points
//		    static int distSq(Point p1, Point p2) {
//		        return (p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y);
//		    }
//
//		    // Helper to check if angle is 90 degrees using dot product
//		    static boolean isRightAngle(Point a, Point b, Point c) {
//		        int dotProduct = (a.x - b.x)*(c.x - b.x) + (a.y - b.y)*(c.y - b.y);
//		        return dotProduct == 0;
//		    }
//
//		    static String identifyShape(Point p1, Point p2, Point p3, Point p4) {
//		        Point[] pts = {p1, p2, p3, p4};
//
//		        // Check all permutations of points to find one that satisfies square or rectangle
//		        for (int i = 0; i < 4; i++) {
//		            Point A = pts[i];
//		            Point B = pts[(i + 1) % 4];
//		            Point C = pts[(i + 2) % 4];
//		            Point D = pts[(i + 3) % 4];
//
//		            int dAB = distSq(A, B);
//		            int dBC = distSq(B, C);
//		            int dCD = distSq(C, D);
//		            int dDA = distSq(D, A);
//		            int dAC = distSq(A, C); // diagonal
//		            int dBD = distSq(B, D); // diagonal
//
//		            boolean allSidesEqual = dAB == dBC && dBC == dCD && dCD == dDA;
//		            boolean oppSidesEqual = dAB == dCD && dBC == dDA;
//		            boolean diagonalsEqual = dAC == dBD;
//
//		            boolean allRightAngles =
//		                    isRightAngle(A, B, C) &&
//		                    isRightAngle(B, C, D) &&
//		                    isRightAngle(C, D, A) &&
//		                    isRightAngle(D, A, B);
//
//		            if (allSidesEqual && diagonalsEqual && allRightAngles)
//		                return "Square";
//		            else if (oppSidesEqual && diagonalsEqual && allRightAngles)
//		                return "Rectangle";
//		        }
//
//		        return "Other Shape";
//		    }
//
//		    public static void main(String[] args) {
//		        // Sample points
//		        Point p1 = new Point(0, 0);
//		        Point p2 = new Point(2, 0);
//		        Point p3 = new Point(2, 2);
//		        Point p4 = new Point(0, 2);
//
//		        System.out.println(identifyShape(p1, p2, p3, p4)); // Output: Square
//		    }
//		}

		

	}

}
