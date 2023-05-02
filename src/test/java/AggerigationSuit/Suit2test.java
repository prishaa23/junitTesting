package AggerigationSuit;

import org.example.Calculate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Suit2test {
    @Test
    public void testSubtract() {
        assertEquals(0, Calculate.subtract(2, 2));
        assertEquals(-4, Calculate.subtract(-2, 2));
    }
}
