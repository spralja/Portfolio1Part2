public class Point {
    private double x = 0.0;
    private double y = 0.0;
    public Point() {}
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point that) {
        this.x = that.x;
        this.y = that.y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distanceTo(Point that) {
        return 0.0;
    }

    public boolean equals(Point that) {
        return false;
    }

    @Override
    public String toString() {
        return null;
    }
}
