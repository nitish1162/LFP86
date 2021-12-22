package functionDay5;

import java.util.Scanner;

//Java Program to Check Whether an Alphabet is Vowel or Consonant

public class FunctionDay5VowelOrConsonant {
	
	public static void main(String[] args) {
    	System.out.println("Enter a character :");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);

    	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    	{
            System.out.println(ch + " is vowel");
    	}
        else
        {
            System.out.println(ch + " is consonant");
        }

    }

}
