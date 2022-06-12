package com.core.learning;

public class Customers {
    String Name;

    public Customers(String name, int customerPoints, String address) {
        Name = name;
        this.customerPoints = customerPoints;
        this.address = address;
    }

    int customerPoints;
    String address;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCustomerPoints() {
        return customerPoints;
    }

    public void setCustomerPoints(int customerPoints) {
        this.customerPoints = customerPoints;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
