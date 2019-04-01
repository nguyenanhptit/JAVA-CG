package resizeandcolor.shape;

public class Shape implements Colorable, Resizeable {
    private String color = "green";
    private boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    @Override
    public String toString() {
        return "Shape color of " + getColor() + " and "
                + (isFilled() ? "fill" : "not fill");
    }


    @Override
    public void resize(double percent) {

    }

    @Override
    public void howtoColor() {

    }
}
