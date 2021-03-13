import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    private static final double OFFSET = 0.1;
    private static boolean equalsWithinOffset(double d1, double d2) {
        return (d1 + 0.1 >= d2 && d1 - 0.1 <= d2);
    }
    @Test
    public void distance00() {
        Point p1 = new Point();
        Point p2 = new Point();
        assertTrue(equalsWithinOffset(p1.distanceTo(p2), 0.0));
    }

    @Test
    public void distance01() {
        Point p1 = new Point();
        Point p2 = new Point(1.0, 1.0);
        assertTrue(equalsWithinOffset(p1.distanceTo(p2), Math.sqrt(2.0)));
    }

    @Test
    public void equals00() {
        Point p1 = new Point();
        Point p2 = new Point();
        assertTrue(p1.equals(p2));
    }

    @Test
    public void equals01() {
        Point p1 = new Point();
        Point p2 = new Point(1.0, 1.0);
        assertTrue(!p1.equals(p2));
    }

    @Test
    public void toString00() {
        Point p1 = new Point();
        assertTrue(p1.toString().equals("(0.0, 0.0)"));
    }
}