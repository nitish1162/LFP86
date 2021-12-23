package logicalProblemsDay6;

import java.util.Scanner;

/*
 * Perfect Number
a. Just like the Armstrong number, the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number. For example, 28 is the perfect
number because when we sum the divisors of 28, it will result in the same number.
The divisors of 28 are 1, 2, 4, 7, and 14. So,
b. 28 = 1+2+4+7
c. 28 = 28
 */

public class LogicalProblemDay6PerfectNumber {

	public static void main(String[] args)
	{
		int n;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		n = input.nextInt();

		if (isPerfect(n))
			System.out.println(n + " is perfect number.");
		else
			System.out.println(n + " is not perfect number.");
	}

	static boolean isPerfect(int n)
	{
		int sum = 1;

		if (n == 1)
			return false;
		//check divisors or not	
		for(int i=2;i<n;i++)
		{
			if (n % i == 0) 
			{
				sum+=i;			
			}
		}

		////sum of divisor is equal to n, then n is perfect number 
		if(sum ==n)
			return true;

		return false; 	
	}

}
