package com.example.springbootlearning_employeeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping("/employees")
public class EmployeeController {


    @Autowired
    private EmployeeDAO employeeDAO;

    //Get Endpoint to fetch all employees
    @GetMapping("/")
    public Employees getEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeDAO.getEmployee(id);
    }

    @PostMapping("/")
    public ResponseEntity<Object>
    addEmployee(@RequestBody Employee employee) {

        //Generate ID for the employee
        Integer id = employeeDAO.getAllEmployees().getEmployeeList().size()+1;
        employee.setId(id);

        //Add the employee to the list
        employeeDAO.addEmployee(employee);

        //Build Location URI for the new employee
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object>
    removeEmployee(@PathVariable int id) {
        Employee employee = employeeDAO.getEmployee(id);
        if(employee == null) {
            return ResponseEntity.notFound().build();
        }
        employeeDAO.removeEmployee(employee);
        return ResponseEntity.ok().build();
    }
}
