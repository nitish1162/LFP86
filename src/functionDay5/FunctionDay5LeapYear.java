package functionDay5;

import java.util.Scanner;

/*
 * Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.
 */

public class FunctionDay5LeapYear {
	
	public static void main(String[] args) {
		
		int year;
		
		System.out.println("Enter an Year :: ");
		Scanner input = new Scanner(System.in);
		
		year = input.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{
			System.out.println("The year is a leap year");
		}
		else
		{
			System.out.println("The year is not a leap year");
		}
	}

}
