package com.core.learning.char_count_in_string;

import java.util.HashMap;
import java.util.Map;

public class CharCountsInStringsUsingCollection {
    public static void main(String[] args) {
        String str = "Prashant Kumar Tiwari";
        HashMap<Character,Integer> resultMap = new HashMap<>();
        for (int i=0; i<str.length();i++){
            int count = 0;
            if(resultMap.containsKey(str.charAt(i))){
                count = resultMap.get(str.charAt(i));
                count++;
                resultMap.put(str.charAt(i),count);
            } else{
                resultMap.put(str.charAt(i),1);
            }
        }

        System.out.println("Result : " + resultMap);

        for (Character key: resultMap.keySet()){
            System.out.println(key + " founds " + resultMap.get(key) + " times");
        }
        // Map.entry practices
        for (Map.Entry<Character,Integer> item : resultMap.entrySet()){
            System.out.println("Char: " + item.getKey() + " Count: " + item.getValue());
        }
    }
}
