package Bai2;

import java.util.Scanner;

public class Direction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[3][3];

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter " + array.length + " row and " + array[0].length + " col");
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {
				array[r][c] = scanner.nextInt();
			}
		}

		int max = array[0][0];
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {
				System.out.printf(array[r][c] + " ");
				if (array[r][c] > max) {
					max = array[r][c];
				}
			}
			System.out.println();
		}
		System.out.println("gia tri lon nhat mang la : " + max);

	}
}
