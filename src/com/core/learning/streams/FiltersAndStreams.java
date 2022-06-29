package com.core.learning.streams;

import com.core.learning.Customers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersAndStreams {

    // Find Customer name whose points are greater than 80 & from varanasi
    public static void main(String[] args) {
        Customers c1 = new Customers("Prashant",50,"Varanasi");
        Customers c2 = new Customers("Krishna",120,"Hyderabad");
        Customers c3 = new Customers("Rashmi",90,"Varanasi");

        List<Customers> customerList = Arrays.asList(c1,c2,c3);

        List<Customers> newList = customerList
                .stream()
                .filter(c->c.getCustomerPoints()>80 && c.getAddress()=="Varanasi")
                .collect(Collectors.toList());

        newList.forEach(item-> System.out.println(item.getName()));
    }
}
