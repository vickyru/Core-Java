package com.core.learning.char_count_in_string;

public class RemoveCharInString {
    /**
     * If the original string is "Alive is awesome"
     * and the user inputs string to remove "alwsr"
     * then it should print  "ive i eome" as output .
     *
     * If the original string is "Learning never stops"
     * and the user inputs string to remove "estp"
     * then the it should print   "Larning nvr o" as output .
     */
    public static void main(String[] args) {
        String originalStr = "alive is awesome";
        String removeString = "alwsr";
        char[] orginalArray = originalStr.toCharArray();
        char [] removeArray = removeString.toCharArray();
        String temp = "";
        for(int i=0;i<orginalArray.length;i++){
            for (int j=0;j<removeArray.length;j++){
                if(removeArray[j]==orginalArray[i]){
                    temp = originalStr.replaceAll(Character.toString(originalStr.charAt(i)),"");
                    originalStr = temp;
                    System.out.println(temp);
                }
            }

        }
        System.out.println(originalStr);
    }
}
