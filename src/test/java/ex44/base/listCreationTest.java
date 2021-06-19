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
        File reader = new File("src/main/java/ex44/base/exercise44_input.json");
        JsonElement file = JsonParser.parseReader(new FileReader(reader));
        JsonObject object = file.getAsJsonObject();
        List<Products> listProducts = new ArrayList<>();
        JsonArray arrayProducts = object.get("products").getAsJsonArray();

        for(JsonElement productElement : arrayProducts){
            JsonObject productJsonObj = productElement.getAsJsonObject();
            String name = productJsonObj.get("name").getAsString();
            String price = productJsonObj.get("price").getAsString();
            String quantity = productJsonObj.get("quantity").getAsString();
            Products product = new Products(name, price, quantity);
            listProducts.add(product);
        }

        List<Products> expected = listProducts;
        List<Products> actual = listCreator.createList(listProducts, object);
        assertArrayEquals(expected, actual);
    }

    private void assertArrayEquals(List<Products> expected, List<Products> actual) {
    }

}