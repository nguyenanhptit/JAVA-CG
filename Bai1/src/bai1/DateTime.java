package bai1;

import java.util.Date;
import java.util.Scanner;

public class DateTime {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("now date " + date);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Which month that you want to count days? ");
		int month = scanner.nextInt();
		
		String dayinMonth;
		switch (month) {
		case 2:
			dayinMonth = "28 or 29";
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayinMonth = "31 day";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dayinMonth = "30 day";
			break;
		default:
			dayinMonth = "";
		}

		if (dayinMonth != "") {
			System.out.printf("the month '%d' has %s days", month, dayinMonth);
		} else {
			System.out.println("Invalid input");
		}
	}
}
