package ex41.base;

import java.util.List;
import java.util.Scanner;

public class ListBase41 {
    //Create an ArrayList to get amount of employees in input file easily.
    //*       Sort the arraylist alphabetically by last name. This can be done by using Collections.sort
    public List<String> getInputFromFile(Scanner inputIO, List<String> employees){
        while(inputIO.hasNextLine()){
            employees.add(inputIO.nextLine());
        }
        return employees;
    }
}
