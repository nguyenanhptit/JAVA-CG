package Bai1;

import java.util.Scanner;

import java.lang.Math;

public class ExamVarMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// bai1
//		System.out.println("Nhap so diem Ly, Hoa, Sinh: ");

//		float ly = scanner.nextFloat();
//		float hoa = scanner.nextFloat();
//		float sinh = scanner.nextFloat();
//		
//		float sum  = ly + hoa + sinh;
//		float avg = sum /3;
//		
//		System.out.println("Tong diem 3 mon " + sum);
//		System.out.println("Diem trung binh 3 mon " + avg);

		// bai2
//		System.out.println("Nhap nhiet do C ");
//		float c = scanner.nextFloat();
//		float f = (9*c/5)+32;
//		
//		System.out.println("do F la " + f);

		// bai 3
//	System.out.println("nhap ban kinh hinh tron ");
//	float r = scanner.nextFloat();
//	float perimeter = (float) (2*r *Math.PI);
//	float acreage = (float) (r*r*Math.PI);
//	System.out.println("chu vi hinh tron " + perimeter);
//	System.out.println("dien tich hinh tron "+acreage);

		// bai4
		System.out.println("Giai phuong trinh bac 2 ");
		System.out.println("Ban hay nhap a :");
		int a = scanner.nextInt();
		System.out.println("Ban hay nhap b :");
		int b = scanner.nextInt();
		System.out.println("Ban hay nhap c :");
		int c = scanner.nextInt();
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phuong trinh vo so nghiem");
				} else {
					System.out.println("Phuong trinh vo nghiem");
				}
			} else {
				float x = (float) -c / b;
				System.out.println("Phuong trinh co mot nghiem : " + x);
			}
		} else {
			int delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.println("Phuong trinh co nghiem kep : " + x);
			} else {
				float canDelta = (float) Math.sqrt(delta);
				float x1 = (float) (-b + canDelta) / (2 * a);
				float x2 = (float) (-b - canDelta) / (2 * a);
				System.out.println("Phuong trinh co hai nghiem phan biet : ");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);

			}
		}
	}

}
