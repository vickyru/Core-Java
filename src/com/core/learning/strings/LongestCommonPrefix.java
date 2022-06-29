package com.core.learning.strings;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        System.out.println(strs[0]);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs[0].length();i++){
            if((""+strs[0].charAt(i)).equals(""+strs[1].charAt(i)) && (""+strs[0].charAt(i)).equals(""+strs[2].charAt(i))){
                sb=sb.append(strs[0].charAt(i));
            }else {
                break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }
}
