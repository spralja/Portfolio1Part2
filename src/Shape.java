/**
 * The abstract superclass of all Shapes
 * @class Shape
 */
public abstract class Shape {
    public Shape() {}

    /**
     *
     * @return the centre of the shape (if the centre is ambiguous one of the centres is arbitrarily chosen)
     */
    public abstract Point getCenter();

    /**
     *
     * @return the area of the shape (if the shape does not have an area returns 0.0)
     */
    public abstract double getArea();

    /**
     *
     * @return the circumference of the shape (if the shape has no circumference returns 0.0)
     */
    public abstract double getCircumference();

    /**
     *
     * @param point a Point
     * @return true if the Point is inside the shape (not directly on its lines) otherwise returns false
     */
    public abstract boolean isInside(Point point);

    /**
     *
     * @param that another Shape
     * @return the distance between the centres of the shapes
     */
    public double distanceTo(Shape that) {
        return this.getCenter().distanceTo(that.getCenter());
    }
}
