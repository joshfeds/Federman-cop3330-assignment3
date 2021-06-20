package ex44.base;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class listCreationTest {

    @Test
    void createList() throws IOException {
        listCreation listCreator = new listCreation();
        File reader = new File("resources/ex44/base/exercise44_input.json");
        JsonElement file = JsonParser.parseReader(new FileReader(reader));
        JsonObject object = file.getAsJsonObject();
        List<Products> listProducts = new ArrayList<>();
        JsonArray arrayProducts = object.get("products").getAsJsonArray();

        Products product1 = new Products("Xbox One", "2500.00", "45");
        Products product2 = new Products("Playstation", "1500.00", "53");
        Products product3 = new Products("Soulja Boy Console", "500.00", "100000");
        Products product4 = new Products("KFC Console", "200.00", "1600");
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);


        List<Products> expected = listProducts;
        List<Products> actual = listCreator.createList(listProducts, object);
        assertArrayEquals(expected, actual);
    }

    private void assertArrayEquals(List<Products> expected, List<Products> actual) {
    }

}