package functionDay5;

import java.util.Scanner;

//Java Program to Compute Quotient and Remainder

public class FunctionDay5QuotientAndRemainder {
	
	public static void main(String[] args) {
		System.out.println("Enter the value of dividend and divisor");
		Scanner input = new Scanner(System.in);
		int dividend = input.nextInt();
		int divisor = input.nextInt();
		int q = 0, rem = 0;

		q = dividend / divisor;

		rem = dividend % divisor;

		System.out.println("Quotient when " + dividend + "/" + divisor + " is: " + q);
		System.out.println("Remainder when " + dividend + " is divided by " + divisor + " is: " + rem);
	}

}
