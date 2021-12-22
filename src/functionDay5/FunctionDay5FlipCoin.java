package functionDay5;

import java.util.Scanner;

/*
 * Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
heads
c. O/P -> Percentage of Head vs Tails
 */

public class FunctionDay5FlipCoin {
	
	public static void main(String[] args)

	{
		int heads = 0;
        int tails = 0;
        int counter = 1;
        double randNum = 0.0;
		Scanner input = new Scanner(System.in);
         
        System.out.println("How many times will the coin be flipped? ");
        int flips = input.nextInt();
         
        while(counter <= flips)
        {
            randNum = Math.random();
            System.out.print(counter + "\t" + randNum);
             
            if(randNum < .5)
            {
                heads++;
                System.out.println("\t heads");
            }
            else
            {
                tails++;
                System.out.println("\t tails");
               }
            counter++;      
        }
        System.out.println();
        System.out.println("\n Number of Heads = " + heads);
        System.out.println("\n Number of Tails = " + tails);

	}

}
