package ex46.base;

import java.util.HashMap;
import java.util.Map;

public class StringBase46 {
    //Find the key with the largest value and print the value using asterisks
    public String getStringKey(Integer commonCharacter, HashMap<String, Integer> hashMap){
        String key = new String();

        for(Map.Entry entry : hashMap.entrySet()){
            if(commonCharacter.equals(entry.getValue()))
                key = (String) entry.getKey();
        }
        return key;
    }
    //The longest named key will also have to be found so that the asterisks can be lined up.
    //*        After the key is found and printed, delete the key so that the next greatest value can be found.
    public String createHistogram(HashMap<String, Integer> hashMap, IntegerBase46 intProgram,
                                  int longestWord){
        StringBuilder output = new StringBuilder();
        while(!hashMap.isEmpty()){
            Integer commonCharacter = intProgram.findLargestValue(hashMap);
            String key = getStringKey(commonCharacter, hashMap);
            output.append(key).append(":");
            int spaceUntilLinedUp = longestWord + 1 - key.length();
            while(spaceUntilLinedUp != 0){
                output.append(" ");
                spaceUntilLinedUp--;
            }
            int i = 0;
            while(i < hashMap.get(key)){
                output.append("*");
                i++;
            }
            output.append("\n");
            hashMap.remove(key);
        }
        return output.toString();
    }
}
