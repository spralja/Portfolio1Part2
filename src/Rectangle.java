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

    @Override
    public boolean equals(Shape that) {
        return false;
    }
}
