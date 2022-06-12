package com.core.learning;

/**
 * Find open brakest which are having close braket
 * {{}}}{{{}}{}}
 */
public class FindOpenAndCloseBracket {
    public static void main(String[] args) {
        String brakets = "{{}}}{{{}}{}}";
        String searchItem = "}";
        int count=0;
        for (int i=0; i<=brakets.length(); i++){
            if(brakets.matches(searchItem)){
                count++;
            }
        }
    }
}
