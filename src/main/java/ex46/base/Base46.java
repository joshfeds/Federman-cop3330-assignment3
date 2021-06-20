package ex46.base;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Federman
 Create a program that reads in a file named `exercise46_input.txt` and
 * counts the frequency of words in the file.
 * Then construct a histogram displaying the words and the frequency, and display the histogram to the screen.
 *

Example Output
Given the text file `exercise46_input.txt` with this content

badger badger badger
badger mushroom
mushroom snake badger badger
badger
the program would produce the following output:

badger:   *******
mushroom: **
snake:    *
Constraint
Ensure that the most used word is at the top of the report and the least used words are at the bottom.
*
* Psuedocode:
*   Read input file
*   Create hashmap of the string
*        The key will be the individual words, the value represents how many of each individual key.
*   Find the key with the largest value and print the value using astericks
*        The longest named key will also have to be found so that the astericks can be lined up.
*        After the key is found and printed, delete the key so that the next greatest value can be found.
*
 */
public class Base46 {

    public static void main(String[] args) throws IOException {
        Base46 program = new Base46();
        inputFromFile46 inputProgram = new inputFromFile46();
        IntegerBase46 integerProgram = new IntegerBase46();
        StringBase46 stringProgram = new StringBase46();
        String inputText = inputProgram.inputFileToString();

        HashMap<String, Integer> hashMap = new HashMap<>();
        HashmapBase46 hashmapProgram = new HashmapBase46();

        hashMap = hashmapProgram.getUniqueWords(hashMap, inputText);
        //program.printHistogram(hashMap, hashmapProgram);
        int longestWord = integerProgram.getLongestName(inputText);
        String output = stringProgram.createHistogram(hashMap, hashmapProgram, inputText, longestWord);
        System.out.print(output);
    }
}
