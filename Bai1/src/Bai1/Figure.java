package Bai1;

public class Figure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int row = 0 ; row < 3 ; row++ ) {
//			for(int col = 0 ; col<5; col ++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}

		for (int row = 7; row >= 0; row--) {
			for (int col = 0; col <= row; col++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
