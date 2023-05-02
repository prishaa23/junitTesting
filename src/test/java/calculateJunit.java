import org.junit.Test;
import static org.junit.Assert.*;
import org.example.Calculate;
public class calculateJunit {

    @Test
    public void testAdd() {
        assertEquals(4, Calculate.add(2, 2));
        assertEquals(0, Calculate.add(-2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(0, Calculate.subtract(2, 2));
        assertEquals(-4, Calculate.subtract(-2, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(4, Calculate.multiply(2, 2));
        assertEquals(-4, Calculate.multiply(-2, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculate.divide(4, 2));
        assertEquals(-2, Calculate.divide(-4, 2));
        try {
            Calculate.divide(4, 0);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}
