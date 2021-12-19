package lineComparisonProblem;

import java.util.Scanner;

/*
 * As a fan of geometry, I want to
check equality of two lines
based on the end points, So
that I know when two lines are
the equal. 
- Using Java equals method to check equality of 2 Lengths is
preferable.
 */

public class LineCompProbDay3EqualUC2 {
	
	public static void main(String[] args) {

		String x1, x2, y1, y2;
		double p1, p2;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1 point");
		x1 = sc.next();

		System.out.println("enter y1 point");
		y1 = sc.next();

		System.out.println("enter x2 point");
		x2 = sc.next();

		System.out.println("enter y2 point");
		y2 = sc.next();

		System.out.println("Result1:" + x1.equals(x2));
		System.out.println("Result2:" + y1.equals(y2));

		if (x1.equals(x2) && y1.equals(y2)) {
			System.out.println("Two lines are equal");
		} else {
			System.out.println("Two lines are not equal");
		}
	}

}
