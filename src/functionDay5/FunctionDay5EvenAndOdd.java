package functionDay5;

import java.util.Scanner;

//Java Program to Check Whether a Number is Even or Odd

public class FunctionDay5EvenAndOdd {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int num; // Declare a variable
		System.out.println("Enter a number:");
		num = input.nextInt();

		if (num % 2 == 0)
		{
			System.out.println("The number is even.");
		}
		else
		{
			System.out.println("The number is odd.");
		}
	}

}
