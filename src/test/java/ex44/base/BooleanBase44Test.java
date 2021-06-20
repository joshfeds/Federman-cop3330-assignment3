package ex44.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooleanBase44Test {

    @Test
    void doesProductExist_true() {
        BooleanBase44 program = new BooleanBase44();
        boolean expected = true;

        Products product1 = new Products("Xbox One", "$500", "5");
        Products product2 = new Products("Playstation 5", "$400", "3");
        Products product3 = new Products("Oculus Headset", "$300", "10");
        Products product4 = new Products("Nintendo Wii", "350", "18");
        List<Products> listProducts = new ArrayList<>();
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);
        boolean actual = program.doesProductExist("Oculus Headset", listProducts);
        assertEquals(actual, expected);
    }
    @Test
    void doesProductExist_false() {
        BooleanBase44 program = new BooleanBase44();
        boolean expected = false;

        Products product1 = new Products("Xbox One", "500", "5");
        Products product2 = new Products("Playstation 5", "400", "3");
        Products product3 = new Products("Oculus Headset", "300", "10");
        Products product4 = new Products("Nintendo Wii", "350", "18");
        List<Products> listProducts = new ArrayList<>();
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);
        boolean actual = program.doesProductExist("Nintendo Switch", listProducts);
        assertEquals(actual, expected);
    }
}