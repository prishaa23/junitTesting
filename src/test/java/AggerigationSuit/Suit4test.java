package AggerigationSuit;

import org.example.Calculate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Suit4test {
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
