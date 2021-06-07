/*
 * Vivian Do
 * CSC 1301
 * July 03, 2020
 * 
 * Lab 4: Conditional Statement Execution
 * Rolling Dice Part
 *
 */
import java.lang.Math;

public class lab4_part1 {

	public static void main(String[] args) {
		RollingDice();
		System.out.println();
	}

	public static void RollingDice() {
		
		int diceX=(int)(Math.random()*6+1);
		int diceY=(int)(Math.random()*6+1);
		int sumZ= diceX + diceY;
		
		System.out.println("The roll of Dice X is " +diceX);
		System.out.println("The roll of Dice Y is " +diceY);
		System.out.println("The total roll of Dice X and Y are " +sumZ);
		if (sumZ<6) {
			System.out.println("The total roll is less than 6.");
		}
		else if (sumZ>6 ) {
			System.out.println("The total roll is greater than 6.");
		}
		else if (sumZ==6) {
			System.out.println("The total roll is equal to 6.");
		}
	}

}
