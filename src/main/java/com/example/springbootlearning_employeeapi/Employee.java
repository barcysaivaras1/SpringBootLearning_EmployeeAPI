package com.example.springbootlearning_employeeapi;

//Represents the com.src.Employee entity and allows us to access the data
public class Employee {

    private Integer employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;

    public Employee(){}

    public Employee(Integer id, String fname, String lname, String email, String title){
        this.employee_id = id;
        this.first_name = fname;
        this.last_name = lname;
        this.email = email;
        this.title = title;
    }

    public Integer getId(){return employee_id;}

    public void setId(Integer id){this.employee_id = id;}

    public String getFname(){return first_name;}

    public void setFname(String fname){this.last_name = fname;}

    public String getLname(){return last_name;}

    public void setLname(String lname){this.last_name = lname;}

    public String getEmail(){return email;}

    public void setEmail(String email){this.email = email;}

    public String getTitle(){return title;}

    public void setTitle(String title){this.title = title;}

    @Override
    public String toString(){
        return "com.src.Employee[" + "employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", title="+ title + ']';
    }



}
