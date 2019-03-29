package point;

public class MovablePoint extends Point2D {
    private int xSpeed = 0;
    private int ySpeed = 0;

    Point2D point2D = new Point2D();

    public MovablePoint(int xSpeed, int ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public String move(){
        int x = getX();
        int y = getY();
        x  += xSpeed;
        y  += ySpeed;
       return  "x, y after move is : " + x + ", " + y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + getxSpeed() +
                ", ySpeed=" + getySpeed() + " "
                + super.toString() + " "
                +move()
                + '}';
    }
}
