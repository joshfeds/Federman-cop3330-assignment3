package ex44.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringBase44Test {
    @Test
    void creatingOutput_different_product_list_first_item() {
        StringBase44 program = new StringBase44();


        Products product1 = new Products("Xbox One", "500", "5");
        Products product2 = new Products("Playstation 5", "400", "3");
        Products product3 = new Products("Oculus Headset", "300", "10");
        Products product4 = new Products("Nintendo Wii", "350", "18");
        List<Products> listProducts = new ArrayList<>();
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);

        String expected = "Name: " + listProducts.get(0).name +
                "\nPrice: " + listProducts.get(0).price +
                "\nQuantity: " + listProducts.get(0).quantity;

        String actual = program.creatingOutput("Oculus Headset", listProducts);
    }
    @Test
    void creatingOutput_different_product_list_second_item() {
        StringBase44 program = new StringBase44();


        Products product1 = new Products("Xbox One", "500", "5");
        Products product2 = new Products("Playstation 5", "400", "3");
        Products product3 = new Products("Oculus Headset", "300", "10");
        Products product4 = new Products("Nintendo Wii", "350", "18");
        List<Products> listProducts = new ArrayList<>();
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);

        String expected = "Name: " + listProducts.get(1).name +
                "\nPrice: " + listProducts.get(1).price +
                "\nQuantity: " + listProducts.get(1).quantity;

        String actual = program.creatingOutput("Oculus Headset", listProducts);
    }
    @Test
    void creatingOutput_different_product_list_third_item() {
        StringBase44 program = new StringBase44();


        Products product1 = new Products("Xbox One", "500", "5");
        Products product2 = new Products("Playstation 5", "400", "3");
        Products product3 = new Products("Oculus Headset", "300", "10");
        Products product4 = new Products("Nintendo Wii", "350", "18");
        List<Products> listProducts = new ArrayList<>();
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);

        String expected = "Name: " + listProducts.get(2).name +
                "\nPrice: " + listProducts.get(2).price +
                "\nQuantity: " + listProducts.get(2).quantity;

        String actual = program.creatingOutput("Oculus Headset", listProducts);
    }
    @Test
    void creatingOutput_different_product_list_last_item() {
        StringBase44 program = new StringBase44();


        Products product1 = new Products("Xbox One", "500", "5");
        Products product2 = new Products("Playstation 5", "400", "3");
        Products product3 = new Products("Oculus Headset", "300", "10");
        Products product4 = new Products("Nintendo Wii", "350", "18");
        List<Products> listProducts = new ArrayList<>();
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);

        String expected = "Name: " + listProducts.get(3).name +
                "\nPrice: " + listProducts.get(3).price +
                "\nQuantity: " + listProducts.get(3).quantity;

        String actual = program.creatingOutput("Oculus Headset", listProducts);
    }
}