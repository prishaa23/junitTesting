import java.util.Arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Assert {
    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "trial".getBytes();
        byte[] actual = "trial".getBytes();
        assertArrayEquals("welcome to the session", expected, actual);
    }
    @Test
    public void testAssertEquals() {
        assertEquals("failure - strings are not equal", "prasanthi", "prasanthi");
    }
    @Test
    public void testAssertNotNull() {
        assertNotNull("should not be null ",new Object());
    }
    @Test
    public void testAssertNotSame() {
        assertNotSame("should not be same Object", new Object(), new Object());
    }
    @Test
    public void testAssertThatHasItems() {
        assertThat(Arrays.asList("priya", "prasanthi", "pooja"), hasItems("pooja", "priya"));
    }

    @Test
    public void testAssertThatEveryItemContainsString() {
        assertThat(Arrays.asList(new String[] { "priya", "prasanthi", "pooja" }), everyItem(containsString("a")));
    }
    @Test
    public void testAssertSame() {
        Integer aNumber = Integer.valueOf(0);
        assertSame("should be same", aNumber, aNumber);
    }
    @Test
    public void testAssertTrue() {
        assertTrue("prasanthi", true);
    }
}
