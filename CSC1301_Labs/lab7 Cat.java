/*
 * July 24, 2020
 * 
 * Lab 7: Cat Program (Strings)
 *
 */

public class lab7_Cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("cat");
		System.out.println("This is my String: " + str);
		
		int len = str.length();
		String reverse = "";
		
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println("This is my String printed in reverse: " + reverse);
	}

}
