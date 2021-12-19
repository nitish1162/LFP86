package lineComparisonProblem;

import java.util.Scanner;

/*
 * As a fan of geometry, I want to
model a line based on a point
consisting of (x, y) co-ordinates
using the Cartesian system,
So that I can calculate its
length.
- A Length as 2 Points (x1, y1) and (x2, y2) 
- Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)
*/

public class LineCompProbDay3LengthUC1 {
	
	public static void main(String[] args)

	{
		int x1, x2, y1, y2;

		double dis;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1 point");

		x1 = sc.nextInt();

		System.out.println("enter y1 point");

		y1 = sc.nextInt();

		System.out.println("enter x2point");

		x2 = sc.nextInt();

		System.out.println("enter y2 point");

		y2 = sc.nextInt();

		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("Length of Two Points" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")=" + dis);

	}

}
