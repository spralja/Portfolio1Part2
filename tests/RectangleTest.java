import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private static final double OFFSET = 0.1;
    private static boolean equalsWithinOffset(double d1, double d2) {
        return (d1 + 0.1 >= d2 && d1 - 0.1 <= d2);
    }

    @Test
    public void getCenter00() {
        Rectangle rectangle = new Rectangle();
        assertTrue(rectangle.getCenter().equals(new Point()));
    }

    @Test
    public void getCenter01() {
        Rectangle rectangle = new Rectangle(0.0, 0.0, 1.0, 1.0);
        assertTrue(rectangle.getCenter().equals(new Point(0.5, 0.5)));
    }

    @Test
    public void getCenter02() {
        Rectangle rectangle = new Rectangle(1.0, 1.0, 2.0, 2.0);
        assertTrue(rectangle.getCenter().equals(new Point(1.5, 1.5)));
    }

    @Test
    public void getCenter03() {
        Rectangle rectangle = new Rectangle(2.0, 2.0, 1.0, 1.0);
        assertTrue(rectangle.getCenter().equals(new Point(1.5, 1.5)));
    }

    @Test
    public void getArea00() {
        Rectangle rectangle = new Rectangle();
        assertTrue(equalsWithinOffset(rectangle.getArea(), 0.0));
    }



    @Test
    public void getArea01() {
        Rectangle rectangle = new Rectangle(0.0, 0.0, 1.0, 1.0);
        assertTrue(equalsWithinOffset(rectangle.getArea(), 1.0));
    }

    @Test
    public void getArea02() {
        Rectangle rectangle = new Rectangle(0.0, 0.0, 2.0, 1.0);
        assertTrue(equalsWithinOffset(rectangle.getArea(), 2.0));
    }

    @Test
    public void getArea03() {
        Rectangle rectangle = new Rectangle(1.0, 1.0, 2.0, 2.0);
        assertTrue(equalsWithinOffset(rectangle.getArea(), 1.0));
    }

    @Test
    public void getArea04() {
        Rectangle rectangle = new Rectangle(1.0, 1.0, 2.0, 3.0);
        assertTrue(equalsWithinOffset(rectangle.getArea(), 2.0));
    }

    @Test
    public void getArea05() {
        Rectangle rectangle = new Rectangle(2.0, 3.0, 1.0, 1.0);
        assertTrue(equalsWithinOffset(rectangle.getArea(), 2.0));
    }

    @Test
    public void getCircumference00() {
        Rectangle rectangle = new Rectangle();
        assertTrue(equalsWithinOffset(rectangle.getCircumference(), 0.0));
    }

    @Test
    public void getCircumference01() {
        Rectangle rectangle = new Rectangle(0.0, 0.0, 1.0, 1.0);
        assertTrue(equalsWithinOffset(rectangle.getCircumference(), 4.0));
    }

    @Test
    public void getCircumference02() {
        Rectangle rectangle = new Rectangle(0.0, 0.0, 1.0, 2.0);
        assertTrue(equalsWithinOffset(rectangle.getCircumference(), 6.0));
    }

    @Test
    public void getCircumference03() {
        Rectangle rectangle = new Rectangle(1.0, 1.0, 2.0, 3.0);
        assertTrue(equalsWithinOffset(rectangle.getCircumference(), 6.0));
    }

    @Test
    public void getCircumference04() {
        Rectangle rectangle = new Rectangle(1.0, 1.0, 2.0, 2.0);
        assertTrue(equalsWithinOffset(rectangle.getCircumference(), 4.0));
    }

    @Test
    public void getCircumference05() {
        Rectangle rectangle = new Rectangle(2.0, 2.0, 1.0, 1.0);
        assertTrue(equalsWithinOffset(rectangle.getCircumference(), 4.0));
    }

    @Test
    public void isInside00() {
        Rectangle rectangle = new Rectangle();
        Point point = new Point();
        assertTrue(!rectangle.isInside(point));
    }

    @Test
    public void isInside01() {
        Rectangle rectangle = new Rectangle(0.0, 0.0, 1.0, 1.0);
        Point point = new Point(1.0, 1.0);
        assertTrue(!rectangle.isInside(point));
    }

    @Test
    public void isInside02() {
        Rectangle rectangle = new Rectangle(0.0, 0.0, 1.0, 1.0);
        Point point = new Point(0.5, 0.5);
        assertTrue(rectangle.isInside(point));
    }

    @Test
    public void isInside03() {
        Rectangle rectangle = new Rectangle(0.0, 0.0, 1.0, 1.0);
        Point point = new Point(1.5, 1.5);
        assertTrue(!rectangle.isInside(point));
    }

    @Test
    public void distanceTo00() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        assertTrue(equalsWithinOffset(r1.distanceTo(r2), 0.0));
    }

    @Test
    public void equals00() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        assertTrue(r1.equals(r2));
    }

    @Test
    public void equals01() {
        Rectangle r1 = new Rectangle(0.0, 0.0, 1.0, 1.0);
        Rectangle r2 = new Rectangle(0.0, 0.0, 1.0, 1.0);
        assertTrue(r1.equals(r2));
    }

    @Test
    public void equals02() {
        Rectangle r1 = new Rectangle(1.0, 1.0, 2.0, 2.0);
        Rectangle r2 = new Rectangle(1.0, 1.0, 2.0, 2.0);
        assertTrue(r1.equals(r2));
    }

    @Test
    public void equals03() {
        Rectangle r1 = new Rectangle(1.0, 1.0, 2.0, 2.0);
        Rectangle r2 = new Rectangle(2.0, 1.0, 2.0, 2.0);
        assertTrue(!r1.equals(r2));
    }
}