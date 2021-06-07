/*
 * Vivian Do
 * CSC 1301
 * July ??, 2020
 * 
 * Homework 4: I Called You Program
 *
 */
import java.lang.Math;
import java.util.Scanner;

public class ICalledYou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//user is inputing in their numbers
		System.out.println("Enter in a number, preferably from 0 to 10: ");
		int num1 = scan.nextInt();
		System.out.println("Enter in another number, preferable from 0 to 10: ");
		int num2 = scan.nextInt();
		//the types of calculations that will occur based on what the user has inputed in: 
		int sum= num1 * num2;
		System.out.println("The product of the first and the second number is " + sum + ".");
		//what is the product
		System.out.println("The greater value between the two numbers is " + Math.max(num1, num2) + ".");
		//which is the greater value?
	}

}
