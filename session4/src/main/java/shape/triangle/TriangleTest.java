package shape.triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle("black" , true, 3,4,5);
        System.out.println(triangle);
    }
}
