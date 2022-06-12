package com.core.learning;

import java.util.Arrays;

public class AnagramStrings {
    // isAnagram("listen", "")     -> true
    // isAnagram("triangle", "integral") -> true
    // isAnagram("abc", "bca")           -> true
    // isAnagram("abc", "ccb")           -> false
    // isAnagram("aaa", "aaab")          -> false
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 =  "silent";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println("Is anagram " + Arrays.equals(ch1,ch2));

    }
}
