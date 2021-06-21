package ex46.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class inputFromFile46 {
    //Read input file
    public String inputFileToString()throws IOException {
        return new String(Files.readAllBytes(Paths.get("resources/ex46/base/exercise46_input.txt")));
    }
}
