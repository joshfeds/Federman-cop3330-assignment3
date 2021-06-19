package ex43.base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class website {
    public void fillFile(String output, FileWriter writeFile) throws IOException {
        writeFile.write(output);
        writeFile.flush();
    }
    public String createFolders(boolean haveJavascript, boolean haveCSS, File authorFolder){
        File javaFolder;
        File cssFolder;
        String output = "";
        if(haveJavascript){
            javaFolder = new File(authorFolder + "/js");
            javaFolder.mkdirs();
            output += "\nCreated " + javaFolder;
        }
        if(haveCSS){
            cssFolder = new File(authorFolder + "/css");
            cssFolder.mkdirs();
            output += "\nCreated " + cssFolder;
        }
        return output;
    }
}
