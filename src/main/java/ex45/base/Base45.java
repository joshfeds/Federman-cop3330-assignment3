package ex45.base;

import java.io.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Federman

*
* Psuedocode:
*   Read the file
*   Scan the file and convert it into a string
*   Within the string, search for the word utilize. For every usage, replace with "use".
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
