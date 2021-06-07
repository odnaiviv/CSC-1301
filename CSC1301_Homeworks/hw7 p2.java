/*
 * July 29, 2020
 * 
 * Homework 7 Bonus Program 2
 *
 */

import java.util.Scanner;
public class hw7_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int array[] = new int[10];
		int len = array.length;
		System.out.println("Please enter in ten numbers: ");
		for (int i = 0; i < len; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("Here is the array: ");
		for (int i = 0; i < len; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();
		//for this program, i decided to use spaces "  " instead of tabs /t
		//because it looks neater in my opinion
		//??????
		System.out.println("Here are the distinct numbers in the array: ");
		int j;
		for (int i = 0; i < len; i++) {
			for (j = 0; j < i; j++)
				if (array[i] == array[j])
					break;
				if (i == j)
					System.out.print(array[i] + "  ");
		}
		System.out.println();
	}

}
