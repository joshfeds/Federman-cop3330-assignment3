package ex42.base;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Federman

 *  Pseudocode:
 *  Read input from input file
 *  Scan input
 *  Make a class that constructs the last name, first name, and salary
 *  Make a list of employees
 *  Create a tabular string model filled with the list of employees
 *  print output
 */
public class Base42 {

    public void printOutput(String output){
        System.out.print(output);
    }
    public static void main(String[] args) throws IOException {
        Base42 program = new Base42();
        EmployeeArrayBase42 employeeArrayProgram = new EmployeeArrayBase42();
        StringBase42 stringProgram = new StringBase42();
        FileReader reader = new FileReader("resources/ex42/base/exercise42_input.txt");
        Path paths = Paths.get("resources/ex42/base/exercise42_input.txt");
        Long number = Files.lines(paths).count();
        int count = number.intValue();
        Employee[] employees = new Employee[count];
        Scanner inputIO = new Scanner(reader);
        employees = employeeArrayProgram.createEmployeeList(employees, inputIO);
        String result = stringProgram.getTabularOutput(employees, count);
        program.printOutput(result);
    }
}
