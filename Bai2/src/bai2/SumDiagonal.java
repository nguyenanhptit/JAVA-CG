package bai2;

import java.util.Scanner;

public class SumDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array;
		int size;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter size: ");
			size = scanner.nextInt();
			if (size > 20) {
				System.out.println("Size should not exceed 20");
			}
		} while (size > 20);

		array = new int[size][size];

		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {
				System.out.println("insert ele : [" + r + "] " + " [" + c + "] ");
				array[r][c] = scanner.nextInt();
			}
		}
		int sum = 0;
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {

				System.out.print(array[r][c] + " ");

				if (c == r) {
					sum += array[r][c];
				}
			}
			System.out.println();
		}
		System.out.println(" Tong duong cheo la : " + sum);

	}

}
