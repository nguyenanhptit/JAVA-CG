package resizeandcolor.shape.rectangle.square;

import resizeandcolor.shape.rectangle.Rectangle;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side,side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square side" + getSide() + " " + super.toString();
    }

    @Override
    public void howtoColor() {
        super.howtoColor();
        if( getColor() != null){
            System.out.println(" Square is color: " + getColor() );
        }else{
            System.out.println(" Square is not color ");
        }
    }
}
