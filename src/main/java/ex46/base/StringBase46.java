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
    public String getStringKey(Integer largestCharacter, HashMap<String, Integer> hashMap){
        String key = new String();
        if(hashMap.isEmpty())
            return "";
        for(Map.Entry entry : hashMap.entrySet()){
            if(largestCharacter.equals(entry.getValue()))
                key = (String) entry.getKey();
        }
        return key;
    }
    public String createHistogram(HashMap<String, Integer> hashMap, HashmapBase46 hashmapProgram, String input,
                                  int longestWord){


        String output = new String();
        while(!hashMap.isEmpty()){
            Integer largestCharacter = hashmapProgram.findLargestValue(hashMap);
            String key = getStringKey(largestCharacter, hashMap);
            System.out.print(key + ":");
            int spaceUntilLinedUp = longestWord + 1 - key.length();
            while(spaceUntilLinedUp != 0){
                System.out.print(" ");
                spaceUntilLinedUp--;
            }
            int i = 0;
            while(i < hashMap.get(key).intValue()){
                System.out.print("*");
                i++;
            }
            System.out.print("\n");
            hashMap.remove(key);
        }
        return output;
    }
}
