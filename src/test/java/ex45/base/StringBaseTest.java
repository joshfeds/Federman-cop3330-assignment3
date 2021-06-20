package ex45.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBaseTest {

    @Test
    void swapUsesForUtilize() {
        StringBase program = new StringBase();
        String input = "I love the word utilize! It is my favorite word. I would never utilize the word " +
                "use when I can utilize utilize!";
        String expected = "I love the word use! It is my favorite word. I would never use the word " +
                "use when I can use use!";
        String actual = program.swapUsesForUtilize(input);
        assertEquals(expected, actual);
    }
}