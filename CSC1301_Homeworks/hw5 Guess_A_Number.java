/*
 * July 15, 2020
 * 
 * Homework 5: Guess a Number
 *
 */
import java.util.Scanner;
import java.lang.Math;

public class Guess_A_Number {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int maxNumber;
		int secretNumber;
		int num1;
		int minNumber = 1;
		String answer;
		boolean yn;
		boolean again = true;
		String one = "A new secret number has been chosen!";
		//guessing game ?
		System.out.print("Enter a maximum value for the secret number: ");
		maxNumber = scan.nextInt();
		secretNumber = (int)(Math.random()*maxNumber) + 1;
		System.out.println(one);
		one = "Enter your guess: ";
		System.out.print(one.trim());
		num1 = scan.nextInt();
		while (num1 > secretNumber) {
			System.out.print("Your guess was too high; try again: ");
			num1 = scan.nextInt();
			continue;
		}
		while (num1 < secretNumber) {
			System.out.print("Your guess was too low; try again: ");
			num1 = scan.nextInt();
			continue;
		}
		while (num1 == secretNumber) {
			System.out.println("You won! The secret number was " + secretNumber + ".");
			break;
		}
		System.out.println("Play again? (Y/N): ");
		answer = scan.nextLine();
		if (yn = "N".equalsIgnoreCase(scan.nextLine())) {
			System.out.println("See you later!");
			again = false;
			return;
		}
		else if (yn = "N".equals(scan.nextLine())); {
			System.out.println("Here we go again!");
			again = true;
			main(args);
		}
	}
}
