package ex46.base;

import java.util.HashMap;
import java.util.Map;
/*
output += key + ":";
            int spaceUntilLinedUp = longestWord + 1 - key.length();
            while(spaceUntilLinedUp != 0){
                output += " ";
                spaceUntilLinedUp--;
            }
            hashMap.remove(key);
            key = getStringKey(largestCharacter, hashMap);
            output += "\n";
 */
public class StringBase46 {
    public String getStringKey(Integer commonCharacter, HashMap<String, Integer> hashMap){
        String key = new String();

        for(Map.Entry entry : hashMap.entrySet()){
            if(commonCharacter.equals(entry.getValue()))
                key = (String) entry.getKey();
        }
        return key;
    }
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
