package bai2;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size; 
		int[] array;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("enter size: ");
			size =  scanner.nextInt();
			if(size > 20) {
				System.out.println("size does not not exceed 20 ");
			}
		}while(size >20);
		
		array = new int[size];
		int i = 0;
		while (i < array.length) {
			System.out.print("Enter Student " + (i + 1) + ": ");
		    array[i] = scanner.nextInt();
		    i++;
		}
		
		int count = 0;
		System.out.print("list of mark: ");
		for(int j=0 ; j<array.length; j++) {
			System.out.println(array[j]+ "\t");
			if(array[j] >= 5 && array[j]<=10) {
				count++;
			}
		}
		System.out.print("\n the number of student pass exam : " + count);
	}

}
