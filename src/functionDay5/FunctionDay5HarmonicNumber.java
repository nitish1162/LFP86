package functionDay5;

import java.util.Scanner;
import java.lang.*;

/*
 * Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.
 */

public class FunctionDay5HarmonicNumber {
	
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Number: ");

		int num = input.nextInt();
		double result = 0.0;

		System.out.println("The harmonic series is: ");

		for (int i = num; i > 0; i--) 
		{

			// calculating harmonic values
			result = result + (double) 1 / i;

			System.out.print(+result); //printing result
		}
	}


}
