package ex45.base;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Federman
 * Given the input file of

One should never utilize the word "utilize" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
utilizes an IDE to write her Java programs".
The program should generate

One should never use the word "use" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
uses an IDE to write her Java programs".
Constraints
Prompt for the name of the output file.
Write the output to a new file.
*
* Psuedocode:
*   Read the file
*   Scan the file and convert it into a string
*   Within the string, search for the word utilized. For every usage, replace with "use".
*   Ask for the name of the new output file.
*   Write the newly updated string into the output file.
 */
public class Base45 {
    public void printToFile(FileWriter fileWriter, String output) throws IOException {
        fileWriter.write(output);
        fileWriter.flush();
    }
    public static void main(String[] args) throws IOException{
        Base45 program = new Base45();
        StringBase stringProgram = new StringBase();
        String inputText = stringProgram.inputFileToString();
        String updatedText = stringProgram.swapUsesForUtilize(inputText);
        String outputFileName = stringProgram.getOutputFileName();
        File outputFile = new File("resources/ex45/base/" + outputFileName + ".txt");
        FileWriter fileWriter = new FileWriter(outputFile);
        program.printToFile(fileWriter, updatedText);
    }
}
