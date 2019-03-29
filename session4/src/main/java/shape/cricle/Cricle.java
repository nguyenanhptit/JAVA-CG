package shape.cricle;

import shape.Shape;

public class Cricle extends Shape {
    private double rad = 1.0;

    public Cricle() {

    }

    public Cricle(double rad) {
        this.rad = rad;
    }

    public Cricle(String color, boolean filled, double rad) {
        super(color, filled);
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double getArea() {
        return rad * rad * Math.PI;
    }

    public double getPerimeter() {
        return 2 * rad * Math.PI;

    }

    @Override
    public String toString() {
        return "Cricle{" +
                "rad=" + getRad() + " " + super.toString()
                + " dien tich " + getArea()
                + " chu vi " + getPerimeter()
                + '}';
    }
}
