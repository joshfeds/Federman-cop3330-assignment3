package ex42.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base42Test {

    @Test
    void getTabularOutput_employee_count_less_than_file() {
        Base42 program = new Base42();
        Employee [] employees = new Employee[6];
        employees[0] = new Employee("Josh", "Federman", "-580345");
        employees[1] = new Employee("Omni", "Man", "123456");
        employees[2] = new Employee("Eli", "Manning", "200711");
        employees[3] = new Employee("Johnny", "OnTheSpot", "0");
        employees[4] = new Employee("Tony", "Soprano", "1000975");
        employees[5] = new Employee("Jenna", "Bulldosa", "34268");
        int i = 0;
        StringBuilder output = new StringBuilder("Last      First     Salary\n" +
                "--------------------------\n");
        while(i < 6){
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
        String expected = output.toString();
        String actual = program.getTabularOutput(employees, 6);
        assertEquals(expected, actual);
    }
    @Test
    void getTabularOutput_employee_count_more_than_file() {
        Base42 program = new Base42();
        Employee [] employees = new Employee[11];
        employees[0] = new Employee("Josh", "Federman", "-580345");
        employees[1] = new Employee("Omni", "Man", "123456");
        employees[2] = new Employee("Eli", "Manning", "200711");
        employees[3] = new Employee("Johnny", "OnTheSpot", "0");
        employees[4] = new Employee("Tony", "Soprano", "1000975");
        employees[5] = new Employee("Jenna", "Bulldosa", "34268");
        employees[6] = new Employee("Milly", "Rock", "1456");
        employees[7] = new Employee("Yick", "Yack", "246624");
        employees[8] = new Employee("BLe", "Blu", "8643");
        employees[9] = new Employee("Yo", "Mama", "1000000000000000000000000000000000");
        employees[10] = new Employee("Big", "Fella", "224625254");

        int i = 0;
        StringBuilder output = new StringBuilder("Last      First     Salary\n" +
                "--------------------------\n");
        while(i < 11){
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
        String expected = output.toString();
        String actual = program.getTabularOutput(employees, 11);
        assertEquals(expected, actual);
    }
}