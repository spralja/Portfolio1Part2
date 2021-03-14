public class Rectangle extends Shape{
    private Point a = new Point();
    private Point b = new Point();

    public Rectangle() {}
    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double x1, double y1, double x2, double y2) {
        this.a = new Point(x1, y1);
        this.b = new Point(x2, y2);
    }

    public Rectangle(Rectangle that) {
        this.a = that.a;
        this.b = that.b;
    }

    @Override
    public Point getCenter() {
        return new Point(a.getX() + (b.getX() - a.getX()) / 2.0, a.getY() + (b.getY() - a.getY()) / 2.0);
    }

    @Override
    public double getArea() {
        return Math.abs((a.getX() - b.getX()) * (a.getY() - b.getY()));
    }

    @Override
    public double getCircumference() {
        return 2.0 * (Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY()));
    }

    @Override
    public boolean isInside(Point point) {
        if(point.getX() <= a.getX() && point.getX() <= b.getX()) return false;
        if(point.getX() >= a.getX() && point.getX() >= b.getX()) return false;
        if(point.getY() <= a.getY() && point.getY() <= b.getY()) return false;
        if(point.getY() >= a.getY() && point.getY() >= b.getY()) return false;

        return true;
    }

    public boolean equals(Rectangle that) {
        return (this.a.equals(that.a) && this.b.equals(that.b));
    }
}
