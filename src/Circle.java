public class Circle extends Shape{
    private Point c = new Point();
    private double r = 0.0;

    public Circle() {}
    public Circle(Point c, double r) {
        this.c = c;
        this.r = r;
    }

    public Circle(double x, double y, double r) {
        this.c = new Point(x, y);
        this.r = r;
    }

    public Circle(Circle that) {
        this.c = that.c;
        this.r = r;
    }

    @Override
    public Point getCenter() {
        return this.c;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2.0);
    }

    @Override
    public double getCircumference() {
        return 2.0 * Math.PI * r;
    }

    @Override
    public boolean isInside(Point point) {
        return (c.distanceTo(point) < r);
    }

    public boolean equals(Circle that) {
        return (this.c.equals(that.c) && this.r == that.r);
    }
}
