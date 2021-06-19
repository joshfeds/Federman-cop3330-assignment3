package ex43.base;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class websiteTest {

    @Test
    void createFolders_both_folders() {
        website website = new website();
        File authorFile = new File("./website/Daniel Torres");
        authorFile.mkdir();
        File javaFolder = new File(authorFile + "/js");
        File cssFolder = new File(authorFile + "/css");
        String expected = "\nCreated " + javaFolder + "\nCreated " + cssFolder;
        String actual = website.createFolders(true, true, authorFile);
        assertEquals(expected, actual);
    }
    @Test
    void createFolders_css_folders() {
        website website = new website();
        File authorFile = new File("./website/Daniel Torres");
        authorFile.mkdir();
        File javaFolder = new File(authorFile + "/js");
        File cssFolder = new File(authorFile + "/css");
        String expected = "\nCreated " + cssFolder;
        String actual = website.createFolders(false, true, authorFile);
        assertEquals(expected, actual);
    }
    @Test
    void createFolders_javascript_folders() {
        website website = new website();
        File authorFile = new File("./website/Daniel Torres");
        authorFile.mkdir();
        File javaFolder = new File(authorFile + "/js");
        File cssFolder = new File(authorFile + "/css");
        String expected = "\nCreated " + javaFolder;
        String actual = website.createFolders(true, false, authorFile);
        assertEquals(expected, actual);
    }
    @Test
    void createFolders_no_folders() {
        website website = new website();
        File authorFile = new File("./website/Daniel Torres");
        authorFile.mkdir();
        File javaFolder = new File(authorFile + "/js");
        File cssFolder = new File(authorFile + "/css");
        String expected = "";
        String actual = website.createFolders(false, false, authorFile);
        assertEquals(expected, actual);
    }
}