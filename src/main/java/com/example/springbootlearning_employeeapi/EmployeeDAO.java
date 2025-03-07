package com.example.springbootlearning_employeeapi;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

    private static Employees employees = new Employees();

    static {
        //Sample Data
        employees.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "lokesh@gmail.com"));
        employees.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "alex@gmail.com"));
        employees.getEmployeeList().add(new Employee(3, "David", "Kameron", "david@gmail.com"));
    }

    //Retrieve All Employees
    public Employees getAllEmployees(){
        return employees;
    }

    //Retrieve an Employee by ID
    public Employee getEmployee(int id) {
        for (Employee employee : employees.getEmployeeList()) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    //Add an Employee
    public void addEmployee(Employee employee) {
        employees.getEmployeeList().add(employee);
    }

    //Remove an Employee
    public void removeEmployee(Employee employee) {
        employees.getEmployeeList().remove(employee);
    }
}
