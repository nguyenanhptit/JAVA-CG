package bai2;

import java.util.Scanner;

public class CountText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array;
		int size;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter size: ");
			size = scanner.nextInt();
			if (size > 20) {
				System.out.println("Size should not exceed 20");
			}
		} while (size > 20);
		array = new int[size];
		int i = 0;
		while (i < array.length) {
			System.out.print("Enter ele " + i + " : ");
			array[i] = scanner.nextInt();
			i++;
		}
		System.out.println("Properties list ");
		for (int j = 0; j < array.length; j++) {
			System.out.printf(array[j] + " " + "\n");
		}

		int count = 0;
		System.out.println("nhap so muon dem : ");
		int input = scanner.nextInt();
		for (int j = 0; j < array.length; j++) {
			if (array[j] == input) {
				count++;

			}
		}
		System.out.println("so lan xuat hien cua: " + input + " la " + count);
	}

}
