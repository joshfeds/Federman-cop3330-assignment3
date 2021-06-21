package ex41.base;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Base41 {
    //Print now sorted list into a new file.
    public void printOutput(String output, FileWriter writeFile) throws IOException {
            writeFile.write(output);
            writeFile.flush();
    }
    public static void main(String[] args) throws IOException {
        Base41 program = new Base41();
        ListBase41 listProgram = new ListBase41();
        StringBase41 stringProgram = new StringBase41();

        File reader = new File("resources/ex41/base/exercise41_input.txt");//Read in each name from an input file.
        File writer = new File("resources/ex41/base/exercise41_output.txt");
        FileWriter writeFile = new FileWriter(writer);

        Scanner inputIO = new Scanner(reader);//Scan each name using Scanner

        List<String> employees = new ArrayList<>();
        employees = listProgram.getInputFromFile(inputIO, employees);

        String output = stringProgram.sortedEmployeesList(employees);

        program.printOutput(output, writeFile);
    }
}
