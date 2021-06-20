package ex46.base;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class StringBase46Test {

    @Test
    void getStringKey_test_case_not_in_order() {
        StringBase46 program = new StringBase46();
        String expected = "big";
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("big", 1);
        hashMap.put("big", 2);
        hashMap.put("wonky", 1);
        hashMap.put("bruh", 1);
        hashMap.put("wonky", 2);
        hashMap.put("bruh", 2);
        hashMap.put("big", 3);
        hashMap.put("wonky", 3);
        hashMap.put("big", 4);
        hashMap.put("blahblahblah", 1);

        String actual = program.getStringKey(4, hashMap);
        assertEquals(actual, expected);
    }

    @Test
    void createHistogram_test_Case_key_not_in_order() {
        StringBase46 program = new StringBase46();
        IntegerBase46 intProgram =  new IntegerBase46();
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("big", 1);
        hashMap.put("wonky", 1);
        hashMap.put("big", 2);
        hashMap.put("wonky", 2);
        hashMap.put("big", 3);
        hashMap.put("saucy", 1);
        hashMap.put("bruh", 1);

        hashMap.put("wonky", 3);
        hashMap.put("saucy", 2);
        hashMap.put("saucy", 3);
        hashMap.put("saucy", 4);
        hashMap.put("bruh", 2);
        hashMap.put("saucy", 5);

        String expected = "saucy: *****\n" +
                          "wonky: ***\n" +
                          "big:   ***\n" +
                          "bruh:  **\n";
        String actual = program.createHistogram(hashMap, intProgram, 5);
        assertEquals(actual, expected);
    }
}