package bai2;

import java.util.Collections;
import java.util.Scanner;
import java.lang.Math;

public class MinMax {

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
			System.out.printf(array[j] + " ");
		}

		int max = array[0];
		int index = 1;
		for (int j = 0; j < array.length; j++) {
			if (array[j] > max) {
				max = array[j];
				index = j + 1;
			}
		}

		System.out.println("Max in list is " + max + " position " + index);
		
		int min = array[0];
		
		for (int j = 0; j < array.length; j++) {
			if (array[j] < max) {
				min = array[j];
				index = j + 1;
			}
		}

		System.out.println("Min in list is " + min + " position " + index);

	}
}
