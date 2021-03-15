/**
 * An immutable class representing a circle
 * @class Circle
 * @extends Shape
 */
public class Circle extends Shape{
    private Point c = new Point();
    private double r = 0.0;

    /**
     * Creates a default circle with radius 0.0 and centre in the centre of the coordinate system (really just
     * a point)
     */
    public Circle() {}

    /**
     * Create a circle from a point (its centre) and a radius
     * @param c
     * @param r
     */
    public Circle(Point c, double r) {
        this.c = c;
        this.r = r;
    }

    /**
     * Creates a circle from a set of coordinates (x, y) (its centre) and a radius
     * @param x
     * @param y
     * @param r
     */
    public Circle(double x, double y, double r) {
        this.c = new Point(x, y);
        this.r = r;
    }

    /**
     * Copy constructor
     * @param that
     */
    public Circle(Circle that) {
        this.c = that.c;
        this.r = r;
    }

    /**
     *
     * @return the centre of the circle
     */
    @Override
    public Point getCenter() {
        return this.c;
    }

    /**
     *
     * @return the area of the circle (if the circle has no area returns 0.0)
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2.0);
    }

    /**
     *
     * @return the circumference of the circle (if the circle has no circumference returns 0.0)
     */
    @Override
    public double getCircumference() {
        return 2.0 * Math.PI * r;
    }

    /**
     *
     * @param point a Point
     * @return true the point is inside the circle (if it is directly on the circle's circumference it is
     * not inside) otherwise returns false
     */
    @Override
    public boolean isInside(Point point) {
        return (c.distanceTo(point) < r);
    }

    /**
     *
     * @param that
     * @return whether the circles are identical (same centre and radius)
     */

    public boolean equals(Circle that) {
        return (this.c.equals(that.c) && this.r == that.r);
    }
}
