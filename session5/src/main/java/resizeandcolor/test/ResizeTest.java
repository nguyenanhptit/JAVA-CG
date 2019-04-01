package resizeandcolor.test;

import resizeandcolor.shape.rectangle.Rectangle;

public class ResizeTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(3, 4);

        System.out.println("Origin rectangle : ");
        for (Rectangle rectangle : rectangles) {

            System.out.println(rectangle);
        }
        System.out.println("After Change , is Rectangle : ");
        for (Rectangle rectangle : rectangles) {
            rectangle.resize(200);
            System.out.println( rectangle);
        }
    }


}
