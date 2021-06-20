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
*
* Psuedocode:
* Scan input from json file
* Put input into a list
* Ask user for product name
*   if it doesnt exist within the list, ask again
*   once a product exists, print the name, print, and quantity.
 */

public class Base44 {


    public void printingOutput(String output){
        System.out.print(output);
    }
    public static void main(String[] args) throws IOException{
        Base44 program = new Base44();
        StringBase44 stringProgram = new StringBase44();
        listCreation listCreator = new listCreation();
        File reader = new File("resources/ex44/base/exercise44_input.json");
        JsonElement file = JsonParser.parseReader(new FileReader(reader));
        JsonObject object = file.getAsJsonObject();

        List<Products> listProducts = new ArrayList<>();
        listProducts = listCreator.createList(listProducts, object);

        String productName = stringProgram.getProductName(listProducts);
        String output = stringProgram.creatingOutput(productName, listProducts);

        program.printingOutput(output);


    }
}
