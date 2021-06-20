package ex42.base;

public class StringBase42 {
    public String getTabularOutput(Employee [] employees, int employeeCount){
        int i = 0;
        StringBuilder output = new StringBuilder("Last      First     Salary\n" +
                "--------------------------\n");
        while(i < employeeCount){
            int spaceFirstName = 10 - employees[i].first.length();
            int spaceLastName = 10 - employees[i].last.length();
            output.append(employees[i].last);
            while(spaceLastName != 0){
                output.append(" ");
                spaceLastName--;
            }
            output.append(employees[i].first);
            while(spaceFirstName != 0){
                output.append(" ");
                spaceFirstName--;
            }
            output.append(employees[i].salary).append("\n");
            i++;
        }
        return output.toString();
    }
}
