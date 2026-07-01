package com.example.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

@Entity
public class EmployeeData {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @NotBlank(message="Name cannot be empty")
    private String name;
    @NotBlank(message="Department cannot be empty")
    private String department;
    @Min(value=0,message="Salary cannot be negative")
    private int salary;
    @NotBlank(message="Email cannot be empty")
    private String email;
    @NotBlank(message="Phone number cannot be empty")
    private String phoneNumber;
    @Min(value=18,message="Age should not be less than 18")
    private int age;
    public EmployeeData(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
