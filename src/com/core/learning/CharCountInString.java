package com.core.learning;

/**
 * Find open brakest which are having close braket
 * PrashantKumarTiwari
 */
public class CharCountInString {
        public static void main(String[] args) {

            // Count alphabets in string
            String brakets = "Prashant ;';'; Kumar && Tiwari";
            System.out.println(brakets.chars().filter(ch -> ch >= (int)'a' && ch <= (int)'z' ||  ch >= (int)'A' && ch <= (int)'Z').count());

            // Count open brakets for them we have closed brackets
            String countBrakets="{}}}{{{{}{}";
            System.out.println( "Open Brackets => " + countBrakets.chars().filter(ch -> ch == (int)'{').count());
            System.out.println( "Closed Brackets=> " + countBrakets.chars().filter(ch -> ch == (int)'}').count());
        }
}
