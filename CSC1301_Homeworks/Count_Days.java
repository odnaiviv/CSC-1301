/*
 * Vivian Do
 * CSC 1301
 * July 15, 2020
 * 
 * Homework 5: Count Days
 *
 */

public class Count_Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalDays = 0;
		int daysInYear;
		for (int year = 2010; year < 2020; year++) {
			daysInYear = 365;
					if (year == 2012 || year == 2016) {
						daysInYear = 366;
					}
			totalDays = totalDays + daysInYear;
		}
		System.out.print("The total days from Jan 1, 2010 to Jan 1, 2020 is " + totalDays + ".");
	}
}
