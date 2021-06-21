package ex44.base;

import java.util.List;
import java.util.Scanner;

public class StringBase44 {
    public static final Scanner input = new Scanner(System.in);
    //Ask user for product name
    //if it doesnt exist within the list, ask again
    public String getProductName(List<Products> listProducts){
        BooleanBase44 booleanProgram = new BooleanBase44();
        System.out.print("What is the product name? ");
        String productName = input.nextLine();
        boolean isProduct = booleanProgram.doesProductExist(productName, listProducts);
        while(!isProduct){
            System.out.println("Sorry, that product was not found in our inventory.");
            System.out.print("What is the product name? ");
            productName = input.nextLine();
            isProduct = booleanProgram.doesProductExist(productName, listProducts);
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
}
