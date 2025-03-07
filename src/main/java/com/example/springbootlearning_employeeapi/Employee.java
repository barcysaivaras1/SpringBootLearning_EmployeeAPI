package com.example.springbootlearning_employeeapi;

//Represents the com.src.Employee entity and allows us to access the data
public class Employee {

    private Integer id;
    private String fname;
    private String lname;
    private String email;

    public Employee(){}

    public Employee(Integer id, String fname, String lname, String email){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    public Integer getId(){return id;}

    public void setId(Integer id){this.id = id;}

    public String getFname(){return fname;}

    public void setFname(String fname){this.fname = fname;}

    public String getLname(){return lname;}

    public void setLname(String lname){this.lname = lname;}

    public String getEmail(){return email;}

    public void setEmail(String email){this.email = email;}

    @Override
    public String toString(){
        return "com.src.Employee[" + "id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ']';
    }



}
