package com.core.learning.duplicates;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateWithStreams {
    public static void main(String[] args) {
        Integer[] intArray = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34};

        // first way
        Set<Integer> intSet = new HashSet<Integer>();
        List<Integer> duplicateList = new ArrayList<>();
        duplicateList = Arrays.stream(intArray).filter(i->!intSet.add(i)).collect(Collectors.toList());
        for (Integer items : duplicateList) {
            System.out.println(items);
        }

        // Second way -> Collections.frequecy()
        List<Integer> intList = Arrays.asList(intArray);
        Set<Integer> duplicateSet = new HashSet<>();
        duplicateSet = intList.stream().filter(number -> Collections.frequency(intList,number)>1).collect(Collectors.toSet());
        for (Integer items : duplicateSet) {
            System.out.println(items);
        }
    }
}
