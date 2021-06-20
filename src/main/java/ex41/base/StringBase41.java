package ex41.base;

import java.util.Collections;
import java.util.List;

public class StringBase41 {
    public String sortedEmployeesList(List<String> employees){
        Collections.sort(employees);
        String output = "Total of " + employees.size() + " names\n" +
                "-----------------\n";
        for(int i = 0; i < employees.size(); i++){
            output += employees.get(i) + "\n";
        }
        return output;
    }
}
