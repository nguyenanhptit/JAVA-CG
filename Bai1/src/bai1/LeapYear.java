package bai1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int year;
		System.out.println("Enter year: ");
		year = scanner.nextInt();
		boolean isLeapYear = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				}
			} else {
				isLeapYear = true;

			}
		}
		if (isLeapYear) {
			System.out.printf("%d is a leap year ", year);
		} else {
			System.out.printf("%d is NOT leap year", year);
		}
	}

}
