package bai2;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1;
		int[] array2;
		int[] array;
		int size1;int size2;
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter size1: ");
			size1 = scanner.nextInt();
			System.out.println("Enter size2: ");
			size2 = scanner.nextInt();
			if (size1 > 20 || size2 >20) {
				System.out.println("Size should not exceed 20");
			}
		} while (size1 > 20 || size2 >20);
		
		
		array1 = new int[size1];
		
		int i1 = 0;
		while (i1 < array1.length) {
			System.out.print("Enter ele " + i1 + " : ");
			array1[i1] = scanner.nextInt();
			i1++;
		}
		System.out.println("Properties list 1 " );
		for (int j = 0; j < array1.length; j++) {
			System.out.print(array1[j] + " " +"\n");
		}
		
		
		
		array2 = new int[size2];
		int i2= 0;
		while (i2 < array2.length) {
			System.out.print("Enter ele " + i2 + " : ");
			array2[i2] = scanner.nextInt();
			i2++;
		}
		System.out.println("Properties list 2");
		for (int j = 0; j < array2.length; j++) {
			System.out.printf(array2[j] + " " +"\n");
		}
		
		array = new int[array1.length + array2.length];
		int count = 0;
		for(int i =0 ; i< array1.length; i++) {
			array[i] = array1[i] ;
			count++;
		}
		
		for(int i =0 ; i< array2.length; i++) {
			array[count++] = array2[i] ;
			
		}
		System.out.println("Properties list merge ");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
	}

}
