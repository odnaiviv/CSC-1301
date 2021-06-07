/*
 * Vivian Do
 * CSC 1301
 * July 09, 2020
 * 
 * Lab 5: Blackjack Jr
 *
 */
import java.lang.Math;
import java.util.Scanner;

public class Blackjack_Jr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Pick a numeric value from 1 to 10: ");
		int num1 = scan.nextInt();
		while (num1 > 10) {
			System.out.println("Please pick any number from 1 to 10: ");
			num1 = scan.nextInt();
		}
		System.out.println("Pick another numeric value from 1 to 10: ");
		int num2 = scan.nextInt();
		while (num2 > 10) {
			System.out.println("Again... please actually pick any number from 1 to 10: ");
			num2 = scan.nextInt();
		}
		int sum1 = num1 + num2;
		System.out.println("You draw " + num1 + " and " + num2 + ".");
		System.out.println("Your total is " + sum1 + ".");
		System.out.println("   ");
		int deal1 = (int)(Math.random()*10+1);
		int deal2 = (int)(Math.random()*10+1);
		System.out.println("The dealer draws " + deal1 + " and " + deal2 + ".");
		int sum2 = deal1 + deal2;
		System.out.println("The dealer's total is " + sum2 + ".");
		System.out.println("  ");
		if (sum1 > sum2) {
			System.out.println("You win!");
		}
		else if (sum1 == sum2) {
			System.out.println("It's a draw!");
		}
		else {
			System.out.println("You lose!");
		}
	}

}
