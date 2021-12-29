package bridgelabz.coreprograms;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter a divident :");
	    int divident = sc.nextInt();
	    System.out.println("Enter a divisor :");
	    int divisor = sc.nextInt();
	    int quotient = divident / divisor;
	    int remainder = divident % divisor;
	    System.out.println("Quotient =" + quotient);
        System.out.println("Remainder =" + remainder); 
        sc.close();
	}

}
