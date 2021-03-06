package ex46.base;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class IntegerBase46 {
    public int getLongestName(String inputFromFile){
        String[] inputAsArray = inputFromFile.split("[\n- ]+");
        int lengthOfWord = 0;

        for(String individualWord:inputAsArray){
            if(lengthOfWord < individualWord.length())
                lengthOfWord = individualWord.length();
        }
        return lengthOfWord;
    }
    public int findLargestValue(HashMap<String, Integer> hashMap){
        return Collections.max(hashMap.values());
    }
}
