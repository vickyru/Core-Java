package com.core.learning.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * // NOT Working
 *
 * javaconceptoftheday ==> oftheday
 */
public class LongestNonRepeatingString {

    private String longestNonRepeatingString(String string){
        String result = "";
        Map<Character,Integer> resultMap = new HashMap<>();
        for (int startIndex = 0, endIndex =0 ; endIndex < string.length() ; endIndex++) {
            if(resultMap.containsKey(string.charAt(endIndex))){
                startIndex = Math.max(resultMap.get(string.charAt(endIndex)) + 1 , startIndex);
            }
            if(result.length() < (endIndex - (startIndex + 1))){
                result = string.substring(startIndex,endIndex+1);
            }
            resultMap.put(string.charAt(endIndex), endIndex);

        }
        return  result;
    }

    public static void main(String[] args) {
        LongestNonRepeatingString obj = new LongestNonRepeatingString();
        System.out.println(obj.longestNonRepeatingString("javaconceptoftheday"));

    }
}
