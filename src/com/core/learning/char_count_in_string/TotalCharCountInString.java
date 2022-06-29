package com.core.learning.char_count_in_string;

/**
 * Find open brakest which are having close braket
 * PrashantKumarTiwari
 */
public class TotalCharCountInString {
        public static void main(String[] args) {

            // Count alphabets in string
            String brakets = "Prashant ;';'; Kumar && Tiwari";
            System.out.println(brakets.chars().filter(ch -> ch >= (int)'a' && ch <= (int)'z' ||  ch >= (int)'A' && ch <= (int)'Z').count());
        }
}
