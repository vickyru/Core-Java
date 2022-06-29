package com.core.learning.reverse;

public class ReverseWordButPreserveOrder {
    public static void main(String[] args) {
        // "this is a test" ==> "siht si a tset"
        String str = "this is a test";
        String [] strArray=str.split(" ");
        for (int i=0; i<strArray.length;i++){
            char [] midStrArray = strArray[i].toCharArray();
            for(int j=midStrArray.length;j>0;j--){
                System.out.print(midStrArray[j-1]);
            }
            System.out.print( " ");
        }

    }
}
