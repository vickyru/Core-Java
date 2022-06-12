package com.core.learning;

public class Employee {
    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    Integer employeeID;
    String employeeName;
    String department;

    public Employee(Integer employeeID, String employeeName, String department){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
    }
}
