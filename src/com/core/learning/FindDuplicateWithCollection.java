package com.core.learning;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateWithCollection {
    public static void main(String[] args) {
        Integer [] array = {8,3,5,1,3,6,9,9,7,6};
        List<Integer> list = Arrays.asList(array);
        Set<Integer> set = new HashSet<Integer>();
        for (int item: list) {
            if(!set.add(item)){
                System.out.println(item);
            }
        }
    }
}