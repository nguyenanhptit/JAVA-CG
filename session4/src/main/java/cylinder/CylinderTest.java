package cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.5);
        System.out.println(cylinder);

        cylinder = new Cylinder("blue" ,true,1.5,5);
        System.out.println(cylinder);
    }
}
