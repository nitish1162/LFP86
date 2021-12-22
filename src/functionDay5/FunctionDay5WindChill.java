package functionDay5;

import java.util.Scanner;

/*
 * Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be:
Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).
 */

public class FunctionDay5WindChill {
	
public static void main(String[] args) {
		
		double temp, velocity;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Temperature(t) value:");
		temp = input.nextDouble();
		System.out.println("Enter Speed(v) value:");
		velocity = input.nextDouble();
		
        double w = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(velocity, 0.16);
        System.out.println("Temperature = " + temp);
        System.out.println("Wind speed  = " + velocity);
        System.out.println("Wind chill  = " + w);

	}

}
