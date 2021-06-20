package ex41.base;

import java.util.List;
import java.util.Scanner;

public class ListBase41 {
    public List<String> getInputFromFile(Scanner inputIO, List<String> employees){
        while(inputIO.hasNextLine()){
            employees.add(inputIO.nextLine());
        }
        return employees;
    }
}
