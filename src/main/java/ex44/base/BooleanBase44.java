package ex44.base;

import java.util.List;
import java.util.ListIterator;

public class BooleanBase44 {
    public boolean doesProductExist(String productName, List<Products> listProducts){
        ListIterator<Products> listIterate = listProducts.listIterator();
        while(listIterate.hasNext()){
            if(productName.equalsIgnoreCase(listIterate.next().name))
                return true;
        }
        return false;
    }

}
