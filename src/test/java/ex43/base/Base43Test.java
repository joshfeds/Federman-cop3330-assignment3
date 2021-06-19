package ex43.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;

import static org.junit.jupiter.api.Assertions.*;

class Base43Test {

    @Test
    void outputToFile() {
        Base43 program = new Base43();
        String expected = "<html>\n" + "\t<head>\n" + "\t\t<title>" + "plub" + "</title>\n";
        expected += "\t\t<meta name=\"author\" content=\"" + "Johnathan Sheepherd" + "\">\n" + "\t</head>\n" +
                "</html>";
        String actual = program.outputToFile("plub", "Johnathan Sheepherd");
        assertEquals(expected, actual);
    }

    @Test
    void outputToConsole_has_javascript_css() {
        Base43 program = new Base43();
        website developWebsite = new website();
        File authorFile = new File("./website/Kalib Bins");
        authorFile.mkdir();
        File writer = new File("./website/Kalib Bins/index.html");
        String expected = "Created " + authorFile;
        expected += "\nCreated " + writer;
        expected += developWebsite.createFolders(true, true, authorFile);

        String actual = program.outputToConsole(true, true, writer, authorFile, developWebsite);
        assertEquals(expected, actual);
    }
    @Test
    void outputToConsole_has_javascript() {
        Base43 program = new Base43();
        website developWebsite = new website();
        File authorFile = new File("./website/Seven Bock");
        authorFile.mkdir();
        File writer = new File("./website/Seven Bock/index.html");
        String expected = "Created " + authorFile;
        expected += "\nCreated " + writer;
        expected += developWebsite.createFolders(true, false, authorFile);

        String actual = program.outputToConsole(true, false, writer, authorFile, developWebsite);
        assertEquals(expected, actual);
    }
    @Test
    void outputToConsole_has_css() {
        Base43 program = new Base43();
        website developWebsite = new website();
        File authorFile = new File("./website/Penelope UMUMUMUMUMU");
        authorFile.mkdir();
        File writer = new File("./website/Penelope UMUMUMUMUMU/index.html");
        String expected = "Created " + authorFile;
        expected += "\nCreated " + writer;
        expected += developWebsite.createFolders(false, true, authorFile);

        String actual = program.outputToConsole(false, true, writer, authorFile, developWebsite);
        assertEquals(expected, actual);
    }
    @Test
    void outputToConsole_has_nothing() {
        Base43 program = new Base43();
        website developWebsite = new website();
        File authorFile = new File("./website/Daniel Torres");
        authorFile.mkdir();
        File writer = new File("./website/Daniel Torres/index.html");
        String expected = "Created " + authorFile;
        expected += "\nCreated " + writer;
        expected += developWebsite.createFolders(false, false, authorFile);

        String actual = program.outputToConsole(false, false, writer, authorFile, developWebsite);
        assertEquals(expected, actual);
    }
}