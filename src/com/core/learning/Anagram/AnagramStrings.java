package com.core.learning.Anagram;

import java.util.Arrays;

public class AnagramStrings {
    // isAnagram("listen", "silent")     -> true
    // isAnagram("triangle", "integral") -> true
    // isAnagram("abc", "bca")           -> true
    // isAnagram("abc", "ccb")           -> false
    // isAnagram("aaa", "aaab")          -> false

    public void method1(){
        String str1 = "listen";
        String str2 =  "silent";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println("Is anagram " + Arrays.equals(ch1,ch2));
    }

    public boolean method2(){
        String str1 = "listen";
        String str2 =  "silent";
        for (int i = 0; i < str1.length(); i++) {
            if(!str2.contains(""+str1.charAt(i))){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
    public static void main(String[] args) {
        AnagramStrings anr = new AnagramStrings();
        anr.method1();
        System.out.println(anr.method2());

    }
}
