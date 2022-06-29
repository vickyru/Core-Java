package com.core.learning.duplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArrayItems {
    public static void main(String[] args) {
        String array [] = {"Red", "Yellow", "Orange", "Red"};
        List<String> arayList= Arrays.asList(array);
        Set<String> arraySet = new HashSet<String>(arayList);
        System.out.println(arayList);
        System.out.println(arraySet);
        for (String colors : arraySet) {
            System.out.println(colors);
        }
    }
}
