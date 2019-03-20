package bai1;

import java.util.Scanner;
import java.lang.Math;

public class UCLN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao a,b : ");
		a = scanner.nextInt();
		b = scanner.nextInt();

		a = Math.abs(a);
		System.out.println(a);
		b = Math.abs(b);

		if (a == 0 || b == 0) {

			System.out.println("No greatest comon factor");

			while (a != b) {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
				System.out.println("greate : " + a);

			}
		}
	}

}
