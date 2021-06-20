package ex42.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBase42Test {

    @Test
    void getTabularOutput_employee_count_less_than_file() {
        StringBase42 program = new StringBase42();
        Employee [] employees = new Employee[6];
        employees[0] = new Employee("Joshua", "Federman", "-580345");
        employees[1] = new Employee("Omni", "Man", "123456");
        employees[2] = new Employee("Eli", "Manning", "200711");
        employees[3] = new Employee("Johnny", "OnTheSpot", "0");
        employees[4] = new Employee("Tony", "Soprano", "1000975");
        employees[5] = new Employee("Jenna", "Bulldosa", "34268");
        int i = 0;
        String output =  "Last      First     Salary\n" +
                         "--------------------------\n"+
                 "Federman  Joshua    -580345\n"+
                 "Man       Omni      123456\n"+
                 "Manning   Eli       200711\n"+
                 "OnTheSpot Johnny    0\n"+
                 "Soprano   Tony      1000975\n"+
                 "Bulldosa  Jenna     34268\n";

        String expected = output;
        String actual = program.getTabularOutput(employees, 6);
        assertEquals(expected, actual);
    }
    @Test
    void getTabularOutput_employee_count_more_than_file() {
        StringBase42 program = new StringBase42();
        Employee [] employees = new Employee[11];
        employees[0] = new Employee("Joshua", "Federman", "-580345");
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

        String output =  "Last      First     Salary\n" +
                         "--------------------------\n" +
                         "Federman  Joshua    -580345\n"+
                         "Man       Omni      123456\n"+
                         "Manning   Eli       200711\n"+
                         "OnTheSpot Johnny    0\n"+
                         "Soprano   Tony      1000975\n"+
                         "Bulldosa  Jenna     34268\n"+
                         "Rock      Milly     1456\n"+
                         "Yack      Yick      246624\n"+
                         "Blu       BLe       8643\n"+
                         "Mama      Yo        1000000000000000000000000000000000\n"+
                         "Fella     Big       224625254\n";

        String expected = output;
        String actual = program.getTabularOutput(employees, 11);
        assertEquals(expected, actual);
    }
}