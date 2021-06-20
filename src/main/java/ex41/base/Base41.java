package ex41.base;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Federman
* Psuedocode:
*
*       Read in each name from an input file.
*       Scan each name using Scanner
*       Create an ArrayList to get amount of employees in input file easily.
*       Sort the arraylist alphabetically by last name. This can be done by using Collections.sort
*           Make the function return a string so that the sorting can be tested
*       Print now sorted list into a new file.
*
 */
public class Base41 {
    public void printOutput(String output, FileWriter writeFile) throws IOException {
            writeFile.write(output);
            writeFile.flush();
    }
    public static void main(String[] args) throws IOException {
        Base41 program = new Base41();
        ListBase41 listProgram = new ListBase41();
        StringBase41 stringProgram = new StringBase41();

        File reader = new File("resources/ex41/base/exercise41_input.txt");
        File writer = new File("resources/ex41/base/exercise41_output.txt");
        FileWriter writeFile = new FileWriter(writer);

        Scanner inputIO = new Scanner(reader);

        List<String> employees = new ArrayList<>();
        employees = listProgram.getInputFromFile(inputIO, employees);

        String output = stringProgram.sortedEmployeesList(employees);

        program.printOutput(output, writeFile);
    }
}
