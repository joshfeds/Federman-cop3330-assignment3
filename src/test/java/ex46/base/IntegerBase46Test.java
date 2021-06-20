package ex46.base;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class IntegerBase46Test {

    @Test
    void getLongestName_the_kids_arent_alright() {
        IntegerBase46 program = new IntegerBase46();
        String input = "When we were young, the future was so bright\n" +
                "Woah-oh\n" +
                "The old neighborhood was so alive\n" +
                "Woah-oh\n" +
                "And every kid on the whole damn street\n" +
                "Woah-oh\n" +
                "Was gonna make it big and not be beat\n" +
                "Now the neighborhood's cracked and torn\n" +
                "Woah-oh\n" +
                "The kids are grown up, but their lives are worn\n" +
                "Woah-oh\n" +
                "How can one little street swallow so many lives?\n" +
                "Chances thrown\n" +
                "Nothing's free\n" +
                "Longing for used to be\n" +
                "Still it's hard, hard to see\n" +
                "Fragile lives\n" +
                "Shattered dreams (Go!)\n" +
                "Jamie had a chance, well she really did\n" +
                "Woah-oh\n" +
                "Instead she dropped out and had a couple of kids\n" +
                "Woah-oh\n" +
                "Mark still lives at home 'cause he's got no job\n" +
                "Woah-oh\n" +
                "He just plays guitar and smokes a lot of pot\n" +
                "Jay commited suicide\n" +
                "Woah-oh\n" +
                "Brandon OD'd and died\n" +
                "Woah-oh\n" +
                "What the hell is going on?\n" +
                "The cruelest dream, reality\n" +
                "Chances thrown\n" +
                "Nothing's free\n" +
                "Longing for used to be\n" +
                "Still it's hard, hard to see\n" +
                "Fragile lives\n" +
                "Shattered dreams (Go!)\n" +
                "Chances thrown\n" +
                "Nothing's free\n" +
                "Longing for (what) used to be\n" +
                "Still it's hard, hard to see\n" +
                "Fragile lives\n" +
                "Shattered dreams";
        int expected = 14;
        int actual = program.getLongestName(input);
        assertEquals(expected, actual);
    }

    @Test
    void findLargestValue() {
        IntegerBase46 program = new IntegerBase46();
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("big", 1);
        hashMap.put("big", 2);
        hashMap.put("big", 3);
        hashMap.put("bruh", 1);
        hashMap.put("bruh", 2);
        hashMap.put("wonky", 1);
        hashMap.put("wonky", 2);
        hashMap.put("wonky", 3);
        hashMap.put("saucy", 1);
        hashMap.put("saucy", 2);
        hashMap.put("saucy", 3);
        hashMap.put("saucy", 4);
        hashMap.put("saucy", 5);
        int expected = 5;
        int actual = program.findLargestValue(hashMap);
        assertEquals(expected, actual);
    }
}