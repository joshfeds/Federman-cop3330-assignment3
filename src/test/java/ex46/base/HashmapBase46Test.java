package ex46.base;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class HashmapBase46Test {

    @Test
    void getUniqueWords() {
        HashmapBase46 program = new HashmapBase46();
        String input = "big big big bruh bruh wonky wonky wonky\n" +
                "saucy saucy saucy \nsaucy saucy";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("big", 1);
        expected.put("big", 2);
        expected.put("big", 3);
        expected.put("bruh", 1);
        expected.put("bruh", 2);
        expected.put("wonky", 1);
        expected.put("wonky", 2);
        expected.put("wonky", 3);
        expected.put("saucy", 1);
        expected.put("saucy", 2);
        expected.put("saucy", 3);
        expected.put("saucy", 4);
        expected.put("saucy", 5);
        HashMap<String, Integer> actual = new HashMap<>();
        actual = program.getUniqueWords(actual, input);
        
        assertArrayEquals(actual, expected);
    }

    private void assertArrayEquals(HashMap<String, Integer> actual, HashMap<String, Integer> expected) {
    }
}