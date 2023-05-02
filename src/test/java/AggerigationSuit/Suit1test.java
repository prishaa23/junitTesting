package AggerigationSuit;

import org.example.Calculate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Suit1test {
    @Test
    public void testAdd() {
        assertEquals(4, Calculate.add(2, 2));
        assertEquals(0, Calculate.add(-2, 2));
    }
}
