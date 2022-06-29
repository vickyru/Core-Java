package com.core.learning;
/**
 * Instructions:
 * Complete the sequence function in java which takes a parameter, N, and returns a list of the numbers 1 to N. If a number is divisible by nineteen, return “Bear” instead. If it is divisible by seventeen, return “Horse” instead. If it is divisible by nineteen and seventeen, return “BearHorse”. Otherwise, return the number as a string. You can use the provided isDivisible function to test if a number is divisible by another.
 *
 * Partial credit is given for solutions which do one or more of the following:
 *
 * Return N items
 * Returns some numbers
 * Returns Bear, Horse, or BearHorse correctly.
 * Returns the correct number when not returning something else
 * Full credit is awarded for a solution which correctly adheres to all task requirements.
 * Sample output: The first twenty elements of the array should be ["1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","Horse","18","Bear","20"]”
 */

import java.util.ArrayList;
import java.util.List;

public class Sequences {

    // Returns true if number is wholly divisible by divisor with no remainder.
    public static boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }

	public static List<String> sequence(int N) {
        List<String> results = new ArrayList<String>();
        // Add your code here
        for (int i = 0; i < N ; i++) {
            if (isDivisible(i,19)){
                results.add("Bear");
            }

            else if (isDivisible(i,17)){
                results.add("Horse");
            }
            else {
                results.add(Integer.toString(i));
            }
        }
        return results;
	}

    public static void main(String[] args) {
        for (String s : sequence(100)) {
            System.out.println(s);
        }
    }
}
