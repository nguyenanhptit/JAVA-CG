package Bai1;

import java.util.Scanner;
import java.lang.Math;

public class SNT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Check number is prime ????? ");
		int number = scanner.nextInt();
		
		if(number <2 ) {
			System.out.println(number + "is not a prime");
		}else {
			int i =2 ;
			boolean check = true;
			while(i <= Math.sqrt(number)) {
				System.out.println(Math.sqrt(number) + " "+ i);
				if(number % i == 0) {
				check =false;
					break;
				}
				i++;
			}
			if(check ) {
				System.out.println(number + " is prime");
			}else {
				System.out.println(number + " is not prime");
			}
		}
	}

}
