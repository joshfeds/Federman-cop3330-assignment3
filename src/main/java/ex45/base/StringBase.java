package ex45.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class StringBase {
    public static final Scanner input = new Scanner(System.in);
    public String inputFileToString()throws IOException {
        return new String(Files.readAllBytes(Paths.get("resources/ex45/base/exercise45_input.txt")));
    }
    public String swapUsesForUtilize(String input){
        String newWord = "use";
        String oldWord = "utilize";
        return input.replace(oldWord, newWord);
    }
    public String getOutputFileName(){
        System.out.print("What will be the name of your output file?");
        return input.nextLine();
    }
}
