package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class Reverse {

	public static <E> void main(String[] args) {
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
		    System.out.print("Enter element " + (i + 1) + ": ");
		    array[i] = scanner.nextInt();
		    i++;
		}
		
		System.out.printf("%s", "Elements in array: ", "");
		for (int j = 0; j < array.length; j++) {
		    System.out.print(array[j] + " ");
		}
		
		for (int j = 0; j < array.length / 2; j++) {
		    int temp = array[j];
		    array[j] = array[size - 1 - j];
		    array[size - 1 - j] = temp;
		}
		
		System.out.printf("%s", "Reverse array: ", "");
		for (int j = 0; j < array.length; j++) {
		    System.out.print(array[j] + " ");
		}
	}

}
