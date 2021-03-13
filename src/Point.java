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
        return Math.sqrt(Math.pow(that.x - this.x, 2.0) + Math.pow(that.y - this.y, 2.0));
    }

    public boolean equals(Point that) {
        return (this.x == that.x && this.y == that.y);
    }

    @Override
    public String toString() {
       StringBuilder string = new StringBuilder();
       string.append("(");
       string.append(x);
       string.append(", ");
       string.append(y);
       string.append(")");
       return string.toString();
    }
}
