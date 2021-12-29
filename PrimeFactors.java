package bridgelabz.coreprograms;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);	
		 num = sc.nextInt();
		for(int i=2; i*i<=num; i++)
		{
		  while (num %i == 0) {
				System.out.println(i+ "");
				num = num / i;
			} 
		}
		 if (num>2) {
			 System.out.println(num);
				
			}
		 sc.close();
	}

}
