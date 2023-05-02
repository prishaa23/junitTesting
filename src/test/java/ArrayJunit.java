
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayJunit {
    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "Codeup".getBytes();
        byte[] actual = "Codeup".getBytes();
        assertArrayEquals("welcome to the session", expected, actual);
    }

    @Test
    public void testassertSame(){
        List languages = new ArrayList<>();
        List moreLanguages = new ArrayList<>();
        List l = languages;
        assertSame(languages,l);
        assertNotSame(languages,moreLanguages);
    }
    @Test
    public void testassertArray(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers,otherNumbers);
    }
    @Test
    public void testassertfalse(){
        String language = "PHP";
        assertTrue(language.contains("H"));
    }

}

