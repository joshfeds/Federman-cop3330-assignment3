package ex43.base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Federman
 Create a program that generates a website skeleton with the following specifications:

Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag
* and the author in a <meta> tag.
Example Output
Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/
The user should then find these files and directories created in the working directory of your program.
*
* Psuedocode:
*   Prompt for website name
*   Prompt for author name
*   Prompt if the user wants a folder for javascript files
*       use boolean to get answer
*   Prompt if the user wants a folder for CSS files
*       use boolean to get answer
*   Generate the html file (look up how to do this)
*   Print each part that was created
 */
public class Base43 {
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
    public String outputToConsole( boolean haveJavascript, boolean haveCSS, File writer, File authorFolder, website web){
        String output = "Created " + authorFolder;
        output += "\nCreated " + writer;
        output += web.createFolders(haveJavascript, haveCSS, authorFolder);
        return output;
    }

    public void printConsoleOutput(String outputConsole){
        System.out.print(outputConsole);
    }
    public static void main(String[] args) throws IOException {
        Base43 program = new Base43();
        website developWebsite = new website();
        folderOptions folderOptions = new folderOptions();
        String websiteName = program.webName();
        String authorName = program.writerName();
        String wantJavascript = program.useJavascriptFiles();
        String wantCSS = program.useCSSFiles();

        boolean hasJavascriptFolder = folderOptions.willCreateFolder(wantJavascript);
        boolean hasCSSFolder = folderOptions.willCreateFolder(wantCSS);

        File website = new File("./website");
        website.mkdir();

        File authorFile = new File("./website/"+authorName);
        authorFile.mkdir();

        File writer = new File("./website/" + authorName + "/index.html");
        FileWriter writeFile = new FileWriter(writer);

        String outputFile = program.outputToFile(websiteName, authorName);
        String outputConsole = program.outputToConsole(hasJavascriptFolder, hasCSSFolder, writer, authorFile, developWebsite);

        developWebsite.fillFile(outputFile, writeFile);
        program.printConsoleOutput(outputConsole);
    }
}
