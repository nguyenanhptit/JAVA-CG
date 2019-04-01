package resizeandcolor.shape.rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5,5.5);
        System.out.println(rectangle);

        rectangle = new Rectangle("black", false, 1.5 , 3.5);
        System.out.println(rectangle);
    }
}
