package com.core.learning;

public class AnagramString {
    /**
     * Input: s = "cbaebabacd", p = "abc"
     * Output: [0,6]
     * Explanation:
     * The substring with start index = 0 is "cba", which is an anagram of "abc".
     * The substring with start index = 6 is "bac", which is an anagram of "abc".
     */

    /**
     * Input: s = "abab", p = "ab"
     * Output: [0,1,2]
     * Explanation:
     * The substring with start index = 0 is "ab", which is an anagram of "ab".
     * The substring with start index = 1 is "ba", which is an anagram of "ab".
     * The substring with start index = 2 is "ab", which is an anagram of "ab".
     */

    public static void main(String[] args) {
        String str1 = "cbaebabacd";
        String str2 = "abcabcabc";  //abc
        int count=0;
        char[] ch1= str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        for (int i=0;i<ch1.length;i++){
            for (int j=str2.indexOf(ch1[i]); j<2;j++) {
                if (ch1[i] == ch2[j]) {
                    count++;
                    if (count==3){
                        System.out.println(i);
                    }
                }else {
                    count=0;
                }
            }
        }
    }
}
