package com.core.learning.strings;

/**
 * a1b2c3d4 =>abbcccdddd
 * a1b5c1
 */
public class AlphabetNumberPatterns {
    public static void main(String[] args) {
        String str = "a1b5c1";
        char [] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int lenght = charArray.length;
        for (int i = 0; i < lenght; i++) {
            if((i!= 0) && ((i+1) % 2)==0){
                int innserLength = ((int)str.charAt(i)-48);
                for (int j = 0; j < innserLength; j++) {
                    sb = sb.append(""+charArray[i-1]);
                }
            }
        }
        System.out.println(sb);
    }
}
