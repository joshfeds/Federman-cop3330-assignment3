package ex44.base;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Stream;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Federman
 Create a program that takes a product name as input and retrieves the current price and quantity
 * for that product.
 * The product data is in a data file in the JSON format  and looks like this
 * (you will create this file as `exercise44_input.json`):

{
    "products" : [
        {"name": "Widget", "price": 25.00, "quantity": 5 },
        {"name": "Thing", "price": 15.00, "quantity": 5 },
        {"name": "Doodad", "price": 5.00, "quantity": 10 }
    ]
}
Print out the product name, price, and quantity if the product is found. If no product matches the search, state that no product was found and start over.

Example Output
What is the product name? iPad
Sorry, that product was not found in our inventory.
What is the product name? Galaxy
Sorry, that product was not found in our inventory.
What is the product name? Thing
Name: Thing
Price: 15.00
Quantity: 5
Constraints
The file is in the JSON format. Use a JSON parser to pull the values out of the file (e.g. https://github.com/google/gson (Links to an external site.)).
If no record is found, prompt again.
*
* Psuedocode:
* Scan input from json file
* Ask user for product name
*   if it doesnt exist, ask again
*   once a product exists, print the name, print, and quantity.
 */

public class Base44 {
    public static final Scanner input = new Scanner(System.in);
    public boolean doesProductExist(String productName, List<Products> listProducts){
        ListIterator<Products> listIterate = listProducts.listIterator();
        while(listIterate.hasNext()){
            if(productName.equalsIgnoreCase(listIterate.next().name))
                return true;
        }
        return false;
    }
    public String getProductName(List<Products> listProducts){
        System.out.print("What is the product name? ");
        String productName = input.nextLine();
        boolean isProduct = doesProductExist(productName, listProducts);
        while(!isProduct){
            System.out.println("Sorry, that product was not found in our inventory.");
            System.out.print("What is the product name? ");
            productName = input.nextLine();
            isProduct = doesProductExist(productName, listProducts);
        }
        return productName;
    }
    public String creatingOutput(String productName, List<Products> listProducts){

        String output = "";

        for(int i = 0; i < listProducts.size(); i++){
            if(productName.equalsIgnoreCase(listProducts.get(i).name)){
                output = "Name: " + listProducts.get(i).name +
                        "\nPrice: " + listProducts.get(i).price +
                        "\nQuantity: " + listProducts.get(i).quantity;
                break;
            }
        }
        return output;
    }
    public void printingOutput(String output){
        System.out.print(output);
    }
    public static void main(String[] args) throws IOException{
        Base44 program = new Base44();
        listCreation listCreator = new listCreation();
        File reader = new File("src/main/java/ex44/base/exercise44_input.json");
        JsonElement file = JsonParser.parseReader(new FileReader(reader));
        JsonObject object = file.getAsJsonObject();

        List<Products> listProducts = new ArrayList<>();
        listProducts = listCreator.createList(listProducts, object);

        String productName = program.getProductName(listProducts);
        String output = program.creatingOutput(productName, listProducts);

        program.printingOutput(output);


    }
}
