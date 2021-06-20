package ex43.base;

import java.io.File;
import java.util.Scanner;

public class StringBase43 {
    public static final Scanner input = new Scanner(System.in);
    public String webName(){
        System.out.print("Site name: ");
        return input.nextLine();
    }
    public String writerName(){
        System.out.print("Author: ");
        return input.nextLine();
    }
    public String useJavascriptFiles(){
        System.out.print("Do you want a folder for JavaScript? ");
        return input.nextLine();
    }
    public String useCSSFiles(){
        System.out.print("Do you want a folder for CSS? ");
        return input.nextLine();
    }
    public String outputToFile(String websiteName, String author){
        String output = "<html>\n" + "\t<head>\n" + "\t\t<title>" + websiteName + "</title>\n";
        output += "\t\t<meta name=\"author\" content=\"" + author + "\">\n" + "\t</head>\n" +
                "</html>";
        return output;
    }
    public String outputToConsole(boolean haveJavascript, boolean haveCSS, File writer, File authorFolder, website web){
        String output = "Created " + authorFolder;
        output += "\nCreated " + writer;
        output += web.createFolders(haveJavascript, haveCSS, authorFolder);
        return output;
    }
}
