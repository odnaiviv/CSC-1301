/*
 * July 17, 2020
 * 
 * Lab 6 part C: Coordinates
 *
 */

public class lab6c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coordinates();
		System.out.println();
	}
	public static void coordinates() {
		for (int x = 0; x <= 5; x++) {
			for (int y = 0; y <= 5; y++) {
				System.out.print("(" + x + "," + y + ") ");
			}
			System.out.println();
		}
	}

}
