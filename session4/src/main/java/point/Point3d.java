package point;

public class Point3d extends Point2D {
    private int z = 0;

    public Point3d(int z) {
        this.z = z;
    }

    public Point3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    public void setXYZ(int x, int y, int z) {
        super.setXY(x, y);
        this.z = z;
    }


    public int getXYZ() {
        int[] xyz = new int[]{this.getX(), this.getY(), this.z};

        return xyz[2];
    }

    @Override
    public String toString() {
        return "Point3d{" + "z=" + getZ() + " "
                + super.toString() + " "
                + " Z = " + getXYZ()
                + '}';
    }
}
