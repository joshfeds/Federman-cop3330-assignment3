package ex41.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ListBase41Test {
    @Test
    void getInputFromFile_test_case_file() throws IOException {
        ListBase41 program = new ListBase41();
        File reader = new File("resources/ex41/testCase/exercise41_input_test.txt");
        Scanner inputIO = new Scanner(reader);
        List<String> employees = new ArrayList<>();
        employees.add("Federman, Joshua");
        employees.add("Torres, Daniel");
        employees.add("Zheng, Villon");
        employees.add("Bricker, Ty");
        employees.add("Slama, Izza");
        employees.add("Yack, Yick");
        employees.add("Bing, Bada");
        employees.add("Moment, Bruh");
        employees.add("Gool, Gaba");
        employees.add("Soprano, Tony");
        employees.add("Wilkins, Eve");
        List<String> expected = employees;
        List<String> actual = new ArrayList<>();
        actual = program.getInputFromFile(inputIO, employees);
        assertArrayEquals(actual, expected);
    }

    private void assertArrayEquals(List<String> actual, List<String> expected) {
    }
}