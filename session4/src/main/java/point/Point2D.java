package point;

public class Point2D {
    private int x = 0;
    private int y = 0;

    public Point2D() {
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getXY() {
        int[] xy = new int[]{this.x, this.y};

        return xy[0];

    }

    @Override
    public String toString() {
        return "Point2D{" + "x=" + getX() + ", y=" + getY()

                + '}';
    }
}
