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
        return new Point((a.getX() + b.getX() + c.getX()) / 3.0, (a.getY() + b.getY() + c.getY()) / 3.0);
    }

    @Override
    public double getArea() {
        return Math.abs((a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() *
                (a.getY() - b.getY())) / 2.0);
    }

    @Override
    public double getCircumference() {
        return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
    }

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

    public boolean equals(Triangle that) {
        return (this.a == that.a && this.b == that.b && this.c == that.c);
    }
}
