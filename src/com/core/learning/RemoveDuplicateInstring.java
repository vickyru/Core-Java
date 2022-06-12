package com.core.learning;

public class RemoveDuplicateInstring {
    // removeDup("hello")  -> "helo"
    // removeDup("apple")  -> "aple"
    // removeDup("aaaaaa") -> "a"
    // removeDup("abc")    -> "abc"
    public static void main(String[] args) {
        String str = "aaaaaa";
        char [] chaArrsy = str.toCharArray();
        String temp = "";
        for (int i=0;i<chaArrsy.length;i++){
            if(!temp.contains(String.valueOf(chaArrsy[i]))){
                temp+=chaArrsy[i];
            }
        }

        System.out.println(temp);
    }
}
