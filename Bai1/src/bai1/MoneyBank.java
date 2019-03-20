package bai1;

import java.util.Scanner;

public class MoneyBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao so tien , so thang mon gui, lai suat: ");
		double money = scanner.nextDouble();
		int month = scanner.nextInt();
		double rate = scanner.nextDouble();
		
		double total_interset = 0;
		for(int i=0 ; i<month; i++) {
			total_interset = money * (rate/100)/12 * month;
		}
		System.out.println("Total of interset: " + total_interset); 

	}

}
