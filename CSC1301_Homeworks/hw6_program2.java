/*
 * Vivian Do
 * CSC 1301
 * July 22, 2020
 * 
 * Homework 6: Program 2
 *
 */

import java.util.Scanner;
public class hw6_program2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int space;
		String name1;
		String name2;
		System.out.print("Please enter your first and last name, seperated by a space: ");
		String fullName = scan.nextLine();
		
		space = fullName.indexOf(' ');
		name1 = fullName.substring(0, space);
		name2 = fullName.substring(space+1);
		
		System.out.println("Your first name is " + name1 + ", which has " + name1.length() + " characters.");
		System.out.println("Your last name is " + name2 + ", which has " + name2.length() + " characters.");
		System.out.println("Did you know that your initials are " + name1.charAt(0) + name2.charAt(0) + "?");
		
		System.out.print("Do you wish to continue, yes or no? (Y/N)");
		String answer;
		boolean yn;
		answer = scan.nextLine();
		if (answer.equals("n")) {
			yn = false;
			System.out.print("Okay. Let's stop here.");
			return;
		}
		else if (answer.equals("y")) {
			yn = true;
			System.out.println("Okay. Let's continue.");
			main(args);
		}
	}
}
