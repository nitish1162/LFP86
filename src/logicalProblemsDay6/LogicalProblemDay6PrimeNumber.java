package logicalProblemsDay6;

import java.util.Scanner;

/*
 * Prime Number
Just like the Perfect number, the Prime number is also a special type of number. When
the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers. All the even numbers can be
divided by 2, so 2 is the only even prime minister.
 */

public class LogicalProblemDay6PrimeNumber {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();

		if (isPrime(n)) {
		System.out.println(n + " is a prime number.");
		} 
		else {
		System.out.println(n + " is not a prime number.");
		}
	}
	
		public static boolean isPrime(int n) {
		if (n <= 1) {
		return false;
		}
		
		for (int i = 2; i < Math.sqrt(n); i++)
		//for (int i = 2; i < n/2; i++)
		{
			if (n % i == 0)
			{
			return false;
			}
		}
		return true;
		}

}
