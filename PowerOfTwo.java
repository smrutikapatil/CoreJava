package bridgelabz.coreprograms;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);  
    System.out.println("Enter power of two :");
    int N = sc.nextInt(); 
    if (0 <= N && N < 31) {
    	for ( int i = 0; i<=N; i++) {
    		int powerValue = (int)Math.pow((double)2,(double)i);
    		System.out.println("2 ^ "+1 +" - " + powerValue);
    	} 
    }else {
    	System.out.println("Please Enter N between 0 and 31");
    }
  sc.close();  
}
}