package ex46.base;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Federman

 */
public class Base46 {
    //print the histogram
    public void printOutput(String output){
        System.out.println(output);
    }
    public static void main(String[] args) throws IOException {
        Base46 program = new Base46();
        inputFromFile46 inputProgram = new inputFromFile46();
        IntegerBase46 integerProgram = new IntegerBase46();
        StringBase46 stringProgram = new StringBase46();
        String inputText = inputProgram.inputFileToString();
        HashMap<String, Integer> hashMap = new HashMap<>();
        HashmapBase46 hashmapProgram = new HashmapBase46();

        hashMap = hashmapProgram.getUniqueWords(hashMap, inputText);
        int longestWord = integerProgram.getLongestName(inputText);
        String output = stringProgram.createHistogram(hashMap, integerProgram, longestWord);
        program.printOutput(output);
    }
}
