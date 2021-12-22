package functionDay5;

import java.util.*;

/*
 * Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 */

public class FunctionDay5Distance {

	public static void main(String args[])

	{
		int x1 = 0, x2, y1 = 0, y2;

		Scanner input = new Scanner(System.in);

		System.out.println("enter point for x2:");

		x2 = input.nextInt();

		System.out.println("enter point for y2:");

		y2 = input.nextInt();

		System.out.println("Distance is: " + distCalculate(x1, y1, x2, y2));

	}

	static double distCalculate(double x1, double y1, double x2, double y2) {

		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);

	}


}
