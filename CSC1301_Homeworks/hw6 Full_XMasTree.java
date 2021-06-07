/*
 * July 22, 2020
 * 
 * Homework 6: Full XMas Tree
 *
 */

import java.util.Scanner;
public class Full_XMasTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the desired number of rows: ");
		int row = scan.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
