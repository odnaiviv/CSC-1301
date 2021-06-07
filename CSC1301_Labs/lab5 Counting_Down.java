/*
 * July 10, 2020
 * 
 * Lab 5: Counting Down
 *
 */

public class Counting_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Counting down from 7:");
		for (int i = 7; i >= 0; i--) {
			if (i%2 == 0) {
				System.out.println(i + " is an even number.");
			}
			else {
				System.out.println(i + " is an odd number.");
			}
		}
		System.out.println("Finished Counting Down!");
	}

}
