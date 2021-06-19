package ex43.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class folderOptionsTest {

    @Test
    void willCreateFolder() {
        folderOptions folderOptions = new folderOptions();
        boolean expected = true;
        boolean actual = folderOptions.willCreateFolder("y");
        assertEquals(expected, actual);
    }

    @Test
    void willCreateFolder_false() {
        folderOptions folderOptions = new folderOptions();
        boolean expected = false;
        boolean actual = folderOptions.willCreateFolder("n");
        assertEquals(expected, actual);
    }
}