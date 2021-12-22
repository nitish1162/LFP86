package functionDay5;

import java.util.*;

//Java Program to Swap Two Numbers

public class FunctionDay5SwapTwoNumbers {
	
	public static void main(String[] args) {
		int x, y, t;// x and y are to swap
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value for X and Y");
		x = input.nextInt();
		y = input.nextInt();
		System.out.println("Before swapping: " + x + "  " + y);
		/* swapping */
		t = x;
		x = y;
		y = t;
		System.out.println("After swapping: " + x + "   " + y);
		System.out.println();
	}

}
