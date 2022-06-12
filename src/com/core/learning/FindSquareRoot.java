package com.core.learning;

public class FindSquareRoot {
    /**
     * sqrtn+1=(sqrtn+(num/sqrtn))/2.0
     */
    public static void main(String[] args) {
        double number = 121;
        double temp=0;
        double sqrt = number/2;
        do {
            temp = sqrt;
            sqrt = (temp+(number/sqrt))/2;
        }while ((temp-sqrt)!=0);
        System.out.println(sqrt);
    }
}
