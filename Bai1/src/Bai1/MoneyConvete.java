package Bai1;

import java.util.Scanner;

public class MoneyConvete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("input USD :");
		float usd = scanner.nextFloat();
		float convete = usd * 23000;
		System.out.println(" VND = " + convete);
	}

}
