/**
 * An immutable class representing a rectangle parallel to the axes defined by two opposite points
 * @class Rectangle
 * @extends Shape
 */
public class Rectangle extends Shape{
    private Point a = new Point();
    private Point b = new Point();

    /**
     * Creates a default rectangle which is really just a default point
     */
    public Rectangle() {}

    /**
     * Creates a rectangle from two points
     * @param a
     * @param b
     */
    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Creates a rectangle from 4 coordinates (the 1st two represent the coordinates of the first point while
     * the 2nd two points represent the coordinates of the second point)
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public Rectangle(double x1, double y1, double x2, double y2) {
        this.a = new Point(x1, y1);
        this.b = new Point(x2, y2);
    }

    /**
     * Copy constructor
     * @param that
     */
    public Rectangle(Rectangle that) {
        this.a = that.a;
        this.b = that.b;
    }

    /**
     * The centre of a Rectangle is unambiguously defined as the intersection point of its 2 diagonals
     * which can be calculated by the formula below
     * @return the centre of the shape
     */
    @Override
    public Point getCenter() {
        return new Point(a.getX() + (b.getX() - a.getX()) / 2.0, a.getY() + (b.getY() - a.getY()) / 2.0);
    }

    /**
     * @return the are of the rectangle (returns 0.0 if the rectangle has no area)
     */
    @Override
    public double getArea() {
        return Math.abs((a.getX() - b.getX()) * (a.getY() - b.getY()));
    }

    /**
     * @return the circumference of the rectangle (returns 0.0 if the rectangle has no circumference)
     */
    @Override
    public double getCircumference() {
        return 2.0 * (Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY()));
    }

    /**
     * @param point a Point
     * @return true if the Point is inside the shape (if the point is directly on the rectangle's lines it
     * is not inside) otherwise returns false
     */
    @Override
    public boolean isInside(Point point) {
        if(point.getX() <= a.getX() && point.getX() <= b.getX()) return false;
        if(point.getX() >= a.getX() && point.getX() >= b.getX()) return false;
        if(point.getY() <= a.getY() && point.getY() <= b.getY()) return false;
        if(point.getY() >= a.getY() && point.getY() >= b.getY()) return false;

        return true;
    }

    /**
     * @param that
     * @return if both points of the rectangle are equal (if points are swapped they are not equal) othrwise
     * returns false
     */
    public boolean equals(Rectangle that) {
        return (this.a.equals(that.a) && this.b.equals(that.b));
    }
}
