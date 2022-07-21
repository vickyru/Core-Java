package com.core.learning.duplicates;

public class RemoveDuplicateInstring {
    // removeDup("hello")  -> "helo"
    // removeDup("apple")  -> "aple"
    // removeDup("aaaaaa") -> "a"
    // removeDup("abc")    -> "abc"
    public void method1(){
        String str = "hello";
        char [] chaArrsy = str.toCharArray();
        String temp = "";
        for (int i=0;i<chaArrsy.length;i++){
            if(!temp.contains(String.valueOf(chaArrsy[i]))){
                temp+=chaArrsy[i];
            }
        }

        System.out.println(temp);
    }

    public void method2(){
        String str = "hello";
        String noDuplicated="";
        for (int i = 0; i < str.length(); i++) {
            if(!noDuplicated.contains(""+str.charAt(i))){
                noDuplicated = noDuplicated + ""+str.charAt(i);
            }
        }
        System.out.println(noDuplicated);
    }
    public static void main(String[] args) {
        RemoveDuplicateInstring obj = new RemoveDuplicateInstring();
        obj.method1();
        obj.method2();
    }
}
