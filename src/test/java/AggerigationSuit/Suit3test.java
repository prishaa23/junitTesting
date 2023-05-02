package AggerigationSuit;

import org.example.Calculate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Suit3test {
    @Test
    public void testMultiply() {
        assertEquals(4, Calculate.multiply(2, 2));
        assertEquals(-4, Calculate.multiply(-2, 2));
    }
}
