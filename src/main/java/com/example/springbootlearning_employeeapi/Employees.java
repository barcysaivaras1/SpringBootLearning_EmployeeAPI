package com.example.springbootlearning_employeeapi;

import java.util.ArrayList;
import java.util.List;


//This is a storage class, it will allow us  to keep track of all the employee entities
public class Employees {

    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList == null ? new ArrayList<>() : employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        //Deep Copy
        this.employeeList = new ArrayList<>(employeeList);
    }
}
