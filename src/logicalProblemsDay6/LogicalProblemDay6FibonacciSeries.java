package logicalProblemsDay6;

import java.util.Scanner;

/*
 * Fibonacci Series
Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).
 */

public class LogicalProblemDay6FibonacciSeries {
	
	public static void main(String[] args) 
	{
	     int maxNumber = 0; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
		    System.out.println("How many numbers you want in Fibonacci:");
	        Scanner scanner = new Scanner(System.in);
	        maxNumber = scanner.nextInt();
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	          
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
 
	}

}
