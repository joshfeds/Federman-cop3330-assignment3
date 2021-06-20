package ex43.base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Federman

* Psuedocode:
*   Prompt for website name
*   Prompt for author name
*   Prompt if the user wants a folder for javascript files
*       use boolean to get answer
*   Prompt if the user wants a folder for CSS files
*       use boolean to get answer
*   Generate the html file
*   Print each part that was created
 */
public class Base43 {
    public void printConsoleOutput(String outputConsole){
        System.out.print(outputConsole);
    }
    public static void main(String[] args) throws IOException {
        Base43 program = new Base43();
        StringBase43 stringProgram = new StringBase43();
        website developWebsite = new website();
        folderOptions folderOptions = new folderOptions();
        String websiteName = stringProgram.webName();
        String authorName = stringProgram.writerName();
        String wantJavascript = stringProgram.useJavascriptFiles();
        String wantCSS = stringProgram.useCSSFiles();

        boolean hasJavascriptFolder = folderOptions.willCreateFolder(wantJavascript);
        boolean hasCSSFolder = folderOptions.willCreateFolder(wantCSS);

        File website = new File("./website");
        website.mkdir();
        File authorFile = new File("./website/"+authorName);
        authorFile.mkdir();
        File writer = new File("./website/" + authorName + "/index.html");
        FileWriter writeFile = new FileWriter(writer);

        String outputFile = stringProgram.outputToFile(websiteName, authorName);
        String outputConsole = stringProgram.outputToConsole(hasJavascriptFolder, hasCSSFolder, writer, authorFile, developWebsite);

        developWebsite.fillFile(outputFile, writeFile);
        program.printConsoleOutput(outputConsole);
    }
}
