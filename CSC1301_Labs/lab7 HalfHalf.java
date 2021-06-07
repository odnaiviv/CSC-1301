/*
 * July 24, 2020
 * 
 * Lab 7: Half Half Program (Strings)
 *
 */
import java.util.Scanner;

public class lab7_HalfHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char ch;
		System.out.print("Enter your String: ");
		String str1 = scan.nextLine();
		int len = str1.length();
		String str2 = "";
		for (int i = 0; i <= (len/2-1); i++) {
			ch = Character.toLowerCase(str1.charAt(i));
			str2 = str2+ch;
		}
		for (int i = len/2; i < len; i++) {
			ch = Character.toUpperCase(str1.charAt(i));
			str2 = str2+ch;
		}
		System.out.println(str2);
	}

}
