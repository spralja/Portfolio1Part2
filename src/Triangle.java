/**
 * An immutable class representing a Triangle
 * the triangle is represented by 3 points (a, b, c)
 * @class Triangle
 * @extends Shape
 */
public class Triangle extends Shape{
    private Point a = new Point();
    private Point b = new Point();
    private Point c = new Point();

    /**
     * Creates a default triangle with all its points int the centre of the coordinate system (is really
     * just a point
     */
    public Triangle() {}

    /**
     * Creates a triangle from 3 points
     * @param a
     * @param b
     * @param c
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Creates a triangle from 3 sets of coordinates (x1, y1), (x2, y2), and (x3, y3)
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     */
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.a = new Point(x1, y1);
        this.b = new Point(x2, y2);
        this.c = new Point(x3, y3);
    }

    /**
     * Copy constructor
     * @param that
     */
    public Triangle(Triangle that) {
        this.a = that.a;
        this.b = that.b;
        this.c = that.c;
    }

    /**
     *
     * @return the centre of the triangle (the centre is defined as a point equidistant to a, b, and c)
     * another possible centre could be a point that is equidistant to all of the triangle's edges
     */
    @Override
    public Point getCenter() {
        return new Point((a.getX() + b.getX() + c.getX()) / 3.0, (a.getY() + b.getY() + c.getY()) / 3.0);
    }

    /**
     *
     * @return the area of the triangle (if it has no area returns 0.0)
     */
    @Override
    public double getArea() {
        return Math.abs((a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() *
                (a.getY() - b.getY())) / 2.0);
    }

    /**
     *
     * @return the circumference of the triangle (if it has no circumference returns 0.0)
     */
    @Override
    public double getCircumference() {
        return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
    }

    /**
     *
     * @param point a Point
     * @return true if the point is inside the triangle (it is not inside if it is directly on one of its
     * edges) otherwise returns false
     */
    @Override
    public boolean isInside(Point point) {
        Triangle t1 = new Triangle(point, a, b);
        Triangle t2 = new Triangle(point, b, c);
        Triangle t3 = new Triangle(point, a, c);
        double A1 = t1.getArea();
        double A2 = t2.getArea();
        double A3 = t3.getArea();
        double A = this.getArea();
        return (A1 + A2 + A3 + 0.1 >= A && A1 + A2 + A3 - 0.1 <= A);
    }

    /**
     * @param that
     * @return true if all individual points of the triangles are equal otherwise returns false
     * (if the points are swapped it returns false i.e. a1 == b2, b1 == c2, c1 == a2)
     */
    public boolean equals(Triangle that) {
        return (this.a == that.a && this.b == that.b && this.c == that.c);
    }
}
