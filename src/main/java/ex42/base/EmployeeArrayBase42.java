package ex42.base;

import java.util.Scanner;

public class EmployeeArrayBase42 {
    //Make a list of employees
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
}
