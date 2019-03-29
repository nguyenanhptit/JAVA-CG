package cricle;

public class CricleTest {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        System.out.println(cricle);

        cricle = new Cricle(3.5);
        System.out.println(cricle);

        cricle = new Cricle("blue",false, 5.5);
        System.out.println(cricle);

    }
}
