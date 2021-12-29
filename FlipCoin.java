package bridgelabz.coreprograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// INITIALIZATION
				int num, head_count = 0, tail_count = 0;
				double heads, tails;
				Scanner sc = new Scanner(System.in);

				System.out.print("enter no. of times you want to flip the coin: ");
				num = sc.nextInt();

				// COMPUTATION
				for (int i = 0; i < num; i++) {
					double random = Math.random();
					if (random < 0.5)
						tail_count++;
					else
						head_count++;
				}

				heads = head_count / (double) num * 100;
				tails = tail_count / (double) num * 100;
				System.out.println("Percentage of heads: " + heads + "%");
				System.out.println("Percentage of tails: " + tails + "%");
				sc.close();
	}


	}
