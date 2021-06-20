package ex41.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class StringBase41Test {

        @Test
        void sortedEmployeesList_test() {
            StringBase41 program = new StringBase41();
            ArrayList<String> list = new ArrayList <>();

            list.add("Soprano, Tony");
            list.add("Grayson, Mark");
            list.add("Reid, Air-Min");
            list.add("Obama, Barack");
            Collections.sort(list);
            String expected = "Total of " + list.size() + " names\n" +
                    "-----------------\n";
            for(int i = 0; i < list.size(); i++){
                expected += list.get(i) + "\n";
            }
            String actual = program.sortedEmployeesList(list);
            assertEquals(expected, actual);
        }
        @Test
        void sortedEmployeesList_more_names() {
            StringBase41 program = new StringBase41();
            ArrayList<String> list = new ArrayList <>();

            list.add("Bong, Bing");
            list.add("Gangster, Original");
            list.add("AeBeCe, DeEeeF");
            list.add("Washington, George");
            list.add("Federman, Joshua");
            list.add("Ro, Knight");
            list.add("ander, Ho(me)ll");
            list.add("White, Walter");
            Collections.sort(list);
            String expected = "Total of " + list.size() + " names\n" +
                    "-----------------\n";
            for(int i = 0; i < list.size(); i++){
                expected += list.get(i) + "\n";
            }
            String actual = program.sortedEmployeesList(list);
            assertEquals(expected, actual);
        }
    }