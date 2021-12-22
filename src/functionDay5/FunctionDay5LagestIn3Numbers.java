package functionDay5;

import java.util.Scanner;

public class FunctionDay5LagestIn3Numbers {
	
	public static void main(String[] args) {
		int a, b, c, largest, temp;
  
		Scanner input = new Scanner(System.in);
  
		System.out.println("Enter the first number:"); 
		a = input.nextInt();
		System.out.println("Enter the second number:");
		b = input.nextInt();
		System.out.println("Enter the third number:");
		c = input.nextInt();
		
//comparing a and b and storing the largest number in a temp variable  
		temp = a > b ? a : b;
//comparing the temp variable with c and storing the result in the variable  
		largest = c > temp ? c : temp;
//prints the largest number  
		System.out.println("The largest number is: " + largest);
	}

}
