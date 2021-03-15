/**
 * An immutable class that stores 2D coordinates
 * @class Point
 */
public class Point {
    private double x = 0.0;
    private double y = 0.0;

    /**
     * Creates a default point at the centre of the coordinate system (0, 0)
     */
    public Point() {}

    /**
     * Creates a point at (x, y)
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Copy constructor
     * @param that the Point we are copying
     */
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

    /**
     *
     * @param that
     * @return the distance between this and that
     */
    public double distanceTo(Point that) {
        return Math.sqrt(Math.pow(that.x - this.x, 2.0) + Math.pow(that.y - this.y, 2.0));
    }

    /**
     *
     * @param that
     * @return true if the points have the same coordinates
     */
    public boolean equals(Point that) {
        return (this.x == that.x && this.y == that.y);
    }

    /**
     * @return String of the value "(x, y)"
     */
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
