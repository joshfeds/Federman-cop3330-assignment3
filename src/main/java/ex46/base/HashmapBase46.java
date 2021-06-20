package ex46.base;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HashmapBase46 {
    public HashMap<String, Integer> getUniqueWords(HashMap<String, Integer> hashMap, String input){
        Pattern createPattern = Pattern.compile("[a-zA-Z]+");
        Matcher matchWords = createPattern.matcher(input);

        while(matchWords.find()){
            String individualWord = matchWords.group();
            if(!hashMap.containsKey(individualWord))
                hashMap.put(individualWord, 1);
            else
                hashMap.put(individualWord, hashMap.get(individualWord) + 1);
        }
        return hashMap;
    }
    public int findLargestValue(HashMap<String, Integer> hashMap){
        return Collections.max(hashMap.values());
    }
}
