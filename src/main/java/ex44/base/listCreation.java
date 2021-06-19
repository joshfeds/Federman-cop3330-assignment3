package ex44.base;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class listCreation {
    public java.util.List<Products> createList(java.util.List<Products> listProducts, JsonObject object){
        JsonArray arrayProducts = object.get("products").getAsJsonArray();
        for(JsonElement productElement : arrayProducts){

            JsonObject productJsonObj = productElement.getAsJsonObject();

            String name = productJsonObj.get("name").getAsString();
            String price = productJsonObj.get("price").getAsString();
            String quantity = productJsonObj.get("quantity").getAsString();

            Products product = new Products(name, price, quantity);
            listProducts.add(product);
        }
        return listProducts;
    }
}
