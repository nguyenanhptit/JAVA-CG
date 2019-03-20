package bai1;

import java.util.Scanner;

public class Math {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		float width; 
//		float heght;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter width");
//		width = scanner.nextFloat();
//		
//		System.out.println("enter height");
//		heght = scanner.nextFloat();
//		
//		float area = width * heght;
//		System.out.println("area is " + area );

		System.out.println("Linear Equation Resolver");
		System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

		Scanner scanner = new Scanner(System.in);
		System.out.print("a, b, c: " );

		double a = scanner.nextDouble();
		System.out.println(a);
		double b = scanner.nextDouble();

		double c = scanner.nextDouble();

		if (a != 0) {
			double result = (c-b) / a;
			System.out.printf("The result is: %f", result);
		}else {
			if(b==0) {
				System.out.println("x = " + a);
			}else {
				System.out.println("no result");
			}
		}
		
	

	}
}