/*
 * Vivian Do
 * CSC 1301
 * July ??, 2020
 * 
 * Homework 4: Find Greatest Value as a Switch Case Statement
 *
 */
import java.util.Scanner;

public class FindGreatestValue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter in the first integer number (0-100): ");
		int num1 = scan.nextInt();
		System.out.println("Please enter in the second integer number (0-100): ");
		int num2 = scan.nextInt();
		System.out.println("Please enter in the third integer number (0-100): ");
		int num3 = scan.nextInt();
		System.out.println("Here are the three integers: " + num1 + ", " + num2 + ", " + num3);
		int i = Math.max(num1, num2);
		
		//Explanation/Clarification:
		//i don't know why but i can't have "int i" by itself so i've decided to keep "Math.max(num1, num2)"
		//my programs still works regardless even when num3 isn't in the Math.max
		//i've tried this a lot and the program works:
		//if num3 is the greatest value, it will print out num3
		
		if (num1 > num2 && num1 > num3) i = 0;
		if (num2 > num1 && num2 > num3) i = 9;
		if (num3 > num1 && num3 > num2) i = 8;
		
		switch (i) {
		case 0:
			System.out.println("The greatest number is: " + num1);
			break;
		case 9:
			System.out.println("The greatest number is: " + num2);
			break;
		case 8: 
			System.out.println("The greatest number is: " + num3);
			break;
		default: 
				System.out.println("Please enter in different numbers!");
		}
	}
		
}
