package point;

import javafx.geometry.Point3D;

public class PointTest {
    public static void main(String[] args) {
        Point2D p2d = new Point2D();
        Point3d p3d = new Point3d(1, 2, 3);
        System.out.println(p2d);
        System.out.println(p3d);

        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint);

    }
}
