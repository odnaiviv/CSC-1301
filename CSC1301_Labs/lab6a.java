/*
 * Vivian Do
 * CSC 1301
 * July 17, 2020
 * 
 * Lab 6 part A: Nesty Me Numbers
 *
 */
public class lab6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nesty_MeNumbers();
		System.out.println();

	}
	public static void nesty_MeNumbers() {
		int rowCount = 1;
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j<rowCount; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			rowCount++;
		}
	}

}
