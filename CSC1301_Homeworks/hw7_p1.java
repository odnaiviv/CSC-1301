/*
 * Vivian Do
 * CSC 1301
 * July 29, 2020
 * 
 * Homework 7 Program 1: 2x3 2-Dimension Array
 *
 */

import java.util.Scanner;
public class hw7_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int row;
		int col;
		int twoxthree[][] = new int[2][3];
		int sum;
		
		System.out.println("Generating a 2x3 2D Array...");
		System.out.println("Please enter in the elements for the 2x3 2D Array: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				twoxthree[i][j] = scan.nextInt();
			}
		}
		System.out.println("Here is what the 2x3 2D Array looks like: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(twoxthree[i][j] + "\t");
			}
			System.out.println();
			//i'm not entirely sure how to add brackets[] in the array
			//without looping them to make the output look like this:
			// [1 [2 [3
			// [4 [5 [6
			//but i hope that if the output looks like this instead:
			// 1 2 3
			// 4 5 6
			//that output would look okay
			//just a confused thought...
			//also i used a tab \t instead of a space " " to make the array look neater
		}
		row = twoxthree.length;
		col = twoxthree[0].length;
		for (int i = 0; i < col; i++) {
			sum = 0;
			for (int j = 0; j < row; j++) {
				sum = sum + twoxthree[j][i];
			}
			System.out.println("The sum of column " + (i) + " is " + sum + ".");
		}
		//aside from not being able to add brackets[] or commas ,
		//i'm positive that this program works! :)
	}
}
