package bridgelabz.coreprograms;

import java.util.Scanner;

public class NumEvenOdd {
	public static void main(String args[])
	  {
	    int num;
	    System.out.println("Enter an Integer number:");
	    Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();

	    /* If number is divisible by 2 then it's an even number
	     * else odd number*/
	    if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");
	    sc.close();
	  }
	}