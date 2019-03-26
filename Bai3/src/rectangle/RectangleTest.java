package rectangle;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter width:");
		float width = scanner.nextFloat();
		System.out.println("Enter height ");
		float height = scanner.nextFloat();
		
		Rectangle rec = new Rectangle(width, height);
		
		 System.out.println(rec.display());
		 System.out.println("dien tich : "+ rec.getArea());
		 System.out.println("chu vi : "+ rec.getPerimeter());
	} 
 
} 
