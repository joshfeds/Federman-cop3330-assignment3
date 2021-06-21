package ex42.base;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Employee {
    public String first;
    public String last;
    public String salary;
    //Make a class that constructs the last name, first name, and salary
    Employee(String lname, String fname, String salary){
        this.first = fname;
        this.last = lname;
        this.salary = salary;
    }
}

