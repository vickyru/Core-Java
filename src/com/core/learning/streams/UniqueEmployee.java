package com.core.learning.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"Bob","Sales"),
                new Employee(2, "John", "IT"),
                new Employee(3,"Tiu", "Sales"),
                new Employee(2,"Shawn", "IT"),
                new Employee(4,"Mac", "Compute"),
                new Employee(3, "Mohan","Sales")
        );
        
        HashSet<Object> hs = new HashSet<>();
        employees.stream()
                .filter(e -> hs.add(e.getEmployeeID()))
                .collect(Collectors.toList());
        Iterator itr = hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
