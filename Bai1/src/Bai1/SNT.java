package Bai1;

import java.util.Scanner;

import jdk.internal.org.objectweb.asm.util.CheckSignatureAdapter;

import java.lang.Math;

public class SNT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Check number is prime ????? ");
		int number = scanner.nextInt();
		
		if (checkSNT(number)== true) {
			System.out.println(number + " is prime");
		} else {
			System.out.println(number + " is not prime");
		}
		
//		System.out.println("cac so nguyen to nho hon 100 la: ");
//			for ( int i =2; i<100; i++) {
//				if(checkSNT(i)) {
//					System.out.println(i + " ");
//				}
//			}
		
		int count = 0;
		System.out.println("20 SNT dau tien la: ");
		int i = 2;
		while(count<20) {
			if(checkSNT(i)) {
				System.out.println(i + " ");
				count ++;
			}
			i++;
		}
		}

	public static boolean  checkSNT(int number) {

		// TODO Auto-generated constructor stub

		if (number < 2) {
			System.out.println(number + "is not a prime");
		} else {
			int i = 2;
			
			while (i <= Math.sqrt(number)) {
				if (number % i == 0) {
					return false;
				}
				i++;
			}
		}
		return true;
		
	}

}
