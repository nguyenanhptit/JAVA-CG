package Bai2;

import java.util.Scanner;

public class TempConvete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double c;
		double f;
		int choice;

		do {
			System.out.println("Menu.");
			System.out.println("1. Fahrenheit to Celsius");
			System.out.println("2. Celsius to Fahrenheit");
			System.out.println("0. Exit");
			System.out.println("Enter your choice: ");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Celsius :");
				c = input.nextDouble();
				System.out.println("C to F " + CtoF(c));
				;
			case 2:
				System.out.println("Enter fahrenheit :");
				f = input.nextDouble();
				System.out.println("F to C " + FtoC(f));
				;
			case 0:
				System.exit(0);
			}
		} while (choice != 0);

	}

	public static double CtoF(double c) {
		double f = (9 / 5) * c + 32;
		return f;

	}

	public static double FtoC(double f) {
		double c = (5 / 9) * (f - 32);
		return c;

	}

}
