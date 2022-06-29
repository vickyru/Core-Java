package com.core.learning.bracket;

/**
 * Find open brakest which are having close braket
 * {{}}}{{{}}{}}
 */
public class FindOpenAndCloseBracket {
    public static void main(String[] args) {

        // Count open brakets for them we have closed brackets
        String countBrakets="{}}}{{{{}{}";
        System.out.println( "Open Brackets => " + countBrakets.chars().filter(ch -> ch == (int)'{').count());
        System.out.println( "Closed Brackets=> " + countBrakets.chars().filter(ch -> ch == (int)'}').count());
        // Find the count of open brakets for which we have closed brakets as well
        char[] charArray = countBrakets.toCharArray();
        int count=0;
        for (int i=0;i<charArray.length-1;i++){
            if(charArray[i] == (int)'{'&& charArray[i+1] == (int)'}' ){
                count++;
            }
        }
        System.out.println( count + " { brakets are having closing } as well");
    }
}
