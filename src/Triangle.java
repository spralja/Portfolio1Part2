public class Triangle extends Shape{
    private Point a = new Point();
    private Point b = new Point();
    private Point c = new Point();

    public Triangle() {}
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.a = new Point(x1, y1);
        this.b = new Point(x2, y2);
        this.c = new Point(x3, y3);
    }

    public Triangle(Triangle that) {
        this.a = that.a;
        this.b = that.b;
        this.c = that.c;
    }

    @Override
    public Point getCenter() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getCircumference() {
        return 0;
    }

    @Override
    public boolean isInside(Point point) {
        return false;
    }

    public boolean equals(Triangle that) {
        return false;
    }
}
