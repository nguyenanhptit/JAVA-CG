package resizeandcolor.test;

import resizeandcolor.shape.rectangle.square.Square;

public class ColorTest {
    public static void main(String[] args) {
        Square[] squares =  new Square[3];
        squares [0] = new Square();
        squares [1] = new Square(5);
        squares [2] = new Square(3,"black", false);

        System.out.println(" Square : ");
        for (Square square : squares) {

            System.out.println(square);
            square.howtoColor();
        }

    }


}
