/*
 * July 17, 2020
 * 
 * Lab 6 part B: Powers
 *
 */

import java.util.Scanner;
public class lab6b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		powers();
		System.out.println();
	}
	public static void powers() {
		int x = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a whole number: ");
		int n = scan.nextInt();
		System.out.println("n^1\tn^2\tn^3\tn^4");
		for (int i = 1; i <= n; i++) {
			int y = 1;
			for (int j = x; j < x + 4; j++) {
				y = y * x;
				System.out.print(y + "\t");
			}
			System.out.println();
			x++;
		}
	}
}
