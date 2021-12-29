package bridgelabz.coreprograms;

import java.util.Scanner;

public class HormonicNumber {

	public static void main(String[] args) {
	double num=0;
	int n;
	Scanner sc = new Scanner(System.in);  
    System.out.println("Enter a Number:");
    n=sc.nextInt();
    for(int i=1; i<=n; i++) {
    	num=num+(double)1/i;
    }
	System.out.println("The Hormonic value of" +n + "is:"+ num);
	sc.close();
	}

}
