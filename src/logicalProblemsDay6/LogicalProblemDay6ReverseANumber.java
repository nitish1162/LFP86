package logicalProblemsDay6;

import java.util.*;

/*
 * Reverse a number
In Java, we can reverse a number either by using for loop, while loop, or using recursion.
The simplest way to reverse a number is by using for loop or while loop. In order to
reverse a number, we have to follow the following steps:
a. We need to calculate the remainder of the number using the modulo
b. After that, we need to multiply the variable reverse by 10 and add the remainder into
it.
c. We then divide the number by 10 and repeat steps until the number becomes 0.
 */

public class LogicalProblemDay6ReverseANumber {
	
	static int rev = 0;
	static void reverse(int n) {
		if (n <= 0)
			return;

		int rem = n % 10; // remainder
		rev = (rev * 10) + rem; 
		reverse(n / 10);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		reverse(n);
		System.out.print("Reversed Number is " + rev);
	}


}
