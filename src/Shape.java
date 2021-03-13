public abstract class Shape {
    public Shape() {}
    public abstract Point getCenter();
    public abstract double getArea();
    public abstract double getCircumference();
    public abstract boolean isInside(Point point);
    public double distanceTo(Shape that) {
        return this.getCenter().distanceTo(that.getCenter());
    }

    public abstract boolean equals(Shape that);
}
