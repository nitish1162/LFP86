package functionDay5;

import java.io.*;
import java.util.Scanner;

/*
 * 2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.
 */

public class FunctionDay52DArray {
	
	public static void main(String args[]) throws IOException {
	     
		int m, n, i, j;   
		Scanner sc=new Scanner(System.in);   
		System.out.print("Enter number of rows: ");   
		//taking row as input  
		m = sc.nextInt();   
		System.out.print("Enter number of columns: ");   
		//taking column as input  
		n = sc.nextInt(); 
		
		int arr[][] = new int[m][n];  
		
		System.out.println("Enter elements of Array: ");  
		        //loop for row  
				for (i = 0; i < m; i++) {
				//inner for loop for column  
				for (j = 0; j < n; j++) { 
					arr[i][j] = sc.nextInt();
				}
			    }
					
				// Loop through all rows
				for (i = 0; i < m; i++) {
				// Loop through all elements of current row
				System.out.println();
				for (j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "\t");
					}
				}
				
	}

}
