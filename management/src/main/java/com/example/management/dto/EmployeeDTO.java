package com.example.management.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Email;
public class EmployeeDTO{
    @NotBlank(message="Name cannot be empty")
    private String name;
    @NotBlank(message="Department cannot be empty")
    private String department;
    @NotBlank(message="Email cannot be empty")
    @Email(message="Email should be valid")
    private String email;
    @NotBlank(message="Phone number cannot be empty")
    private String phoneNumber;
    @Min(value=20, message="Age cannot be less than 20")
    private int age;
    @Min(value=0, message="Salary cannot be negative")
    private int salary;
    
    public EmployeeDTO(){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
}