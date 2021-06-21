package ex45.base;

import java.io.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Base45 {
    //Write the newly updated string into the output file.
    public void printToFile(FileWriter fileWriter, String output) throws IOException {
        fileWriter.write(output);
        fileWriter.flush();
    }
    public static void main(String[] args) throws IOException{
        Base45 program = new Base45();
        StringBase stringProgram = new StringBase();
        String inputText = stringProgram.inputFileToString();
        String updatedText = stringProgram.swapUsesForUtilize(inputText);
        String outputFileName = stringProgram.getOutputFileName();//Ask for the name of the new output file.
        File outputFile = new File("resources/ex45/base/" + outputFileName + ".txt");
        FileWriter fileWriter = new FileWriter(outputFile);
        program.printToFile(fileWriter, updatedText);
    }
}
