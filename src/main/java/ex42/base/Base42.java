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
 *Construct a program that reads in the following data file (you will need to create this data file yourself;
 * name it `exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500
Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.

Example Output
Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500
Constraints
Write your own code to parse the data. Don't use a CSV parser.
 *
 *  Pseudocode:
 *  Read input from input file
 *  Scan input
 *  Make a separate class that constructs the last name, first name, and salary
 *      the constructor will be part of a list.
 *      string will likely have to be parsed at this step in order for the constructors to function
 *          possible idea for parse: have string parse if a special character or linebreak is detected
 * Create function that returns tabular model so that it can be tested for correctness.
 * Print output in a new function.
 */
public class Base42 {
    public Employee [] createEmployeeList(Employee[] employees, Scanner inputIO){
        int i = 0;

        while (inputIO.hasNextLine()){
            String line = inputIO.nextLine();
            String [] employeeAsArray = line.split(",");
            employees[i] = new Employee(employeeAsArray[0], employeeAsArray[1], employeeAsArray[2]);
            i++;
        }

        return employees;
    }
    public String getTabularOutput(Employee [] employees, int employeeCount){
        int i = 0;
        StringBuilder output = new StringBuilder("Last      First     Salary\n" +
                "--------------------------\n");
        while(i < employeeCount){
                int spaceFirstName = 10 - employees[i].first.length();
                int spaceLastName = 10 - employees[i].last.length();
                output.append(employees[i].first);
                while(spaceFirstName != 0){
                    output.append(" ");
                    spaceFirstName--;
                }
                output.append(employees[i].last);
                while(spaceLastName != 0){
                    output.append(" ");
                    spaceLastName--;
                }
            output.append(employees[i].salary).append("\n");
                i++;
        }
        return output.toString();
    }
    public static void main(String[] args) throws IOException {
        Base42 program = new Base42();

        FileReader reader = new FileReader("src/main/java/ex42/base/exercises42_input.txt");
        Path paths = Paths.get("src/main/java/ex42/base/exercises42_input.txt");
        Long number = Files.lines(paths).count();
        int count = number.intValue();
        Employee[] employees = new Employee[count];
        Scanner inputIO = new Scanner(reader);
        employees = program.createEmployeeList(employees, inputIO);
        String result = program.getTabularOutput(employees, count);
        System.out.print(result);
    }
}
