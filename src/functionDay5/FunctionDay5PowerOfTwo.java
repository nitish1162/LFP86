package functionDay5;

import java.util.Scanner;

/*
 * Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.
 */

public class FunctionDay5PowerOfTwo {
	
	public static void main(String[] args) {

		int basenumber = 2, exponent;
		long power = 1;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the exponent: ");

		exponent = input.nextInt();

		while (exponent >= 0 && exponent < 31) {
			power *= basenumber;
			--exponent;
		}
		System.out.println(basenumber + " to the power " + exponent + " is: " + power);
	}

}
