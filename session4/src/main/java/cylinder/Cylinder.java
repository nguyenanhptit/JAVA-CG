package cylinder;

import cricle.Cricle;

public class Cylinder extends Cricle {
    private double height = 1.0;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double rad, double height) {
        super(rad);
        this.height = height;
    }

    public Cylinder(String color, boolean filled, double rad, double height) {
        super(color, filled, rad);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getV() {
        return this.height * getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight()
                + super.toString()
                + " the tich la " + getV()
                + '}';
    }
}
