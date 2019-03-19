package Bai2;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students = { "Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory",
				"Zoe", "Emily" };
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter name : ");
//		String name = scanner.nextLine();
//
//		boolean isExit = false;
//		for (int i = 0; i < students.length; i++) {
//			if (students[i].equals(name)) {
//				System.out.println("position of list : " + name + " is " + i);
//				isExit = true;
//				break;
//			}
//		}
//		if (!isExit) {
//			System.out.println("Not found " + name + " in the list!!! ");
//		}
		
		System.out.println("nhap tu can chen");
		String replace = scanner.nextLine();
		System.out.println("nhap vi tri : ");
		int index = scanner.nextInt();
		if(index <=1 || index > students.length-1) {
			System.out.println("Khong duoc chen vao mang ");
		}else {
			
			students[index] = replace;
		}
		
		for (String x : students) {
			System.out.print(x+" "); 
		}
		
		
		
		
	}
}
