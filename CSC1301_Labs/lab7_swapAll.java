/*
 * Vivian Do
 * CSC 1301
 * July 24, 2020
 * 
 * Lab 7: Swap All Program (Arrays)
 *
 */
public class lab7_swapAll {
	
	static int[] array1 = {11, 42, -5, 27, 0, 89};
	static int[] array2 = {10, 20, 30, 40, 50, 60};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Here are the following arrays we have: ");
		System.out.print("Array1: ");
		for (int num : array1) {
			System.out.print(num + "\t"); //added a tab space because i wanted my output to look clean/neat
			//and not have my numbers stuck together looking like a mess
			//when program is run, it actually looks nice and organized :)
		}
		System.out.println();
		
		System.out.print("Array2: ");
		for (int num : array2) {
			System.out.print(num + "\t");
		}
		
		System.out.println();
		swapAll(array1, array2);
		System.out.println();
		
		System.out.println("Here are the arrays now after we swapped them: ");
		System.out.print("Array1: ");
		for (int num: array1) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		System.out.print("Array2: ");
		for (int num : array2) {
			System.out.print(num + "\t");
		}
		//i've also originally imported the java.util.Arrays package but decided not to use it
		//because although it gives me the expected output, 
		//it may not be the correct(?) way you'd want me to swap the arrays
	}
	
	public static void swapAll(int[] array12, int[] array22) {
		int[] temp = array1;
		array1 = array2;
		array2 = temp;
		//added a temporary integer so that the arrays would swap
	}
}
