package com.example.management.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.management.dto.EmployeeDTO;
import com.example.management.model.EmployeeData;
import com.example.management.service.EmployeeService;
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/addEmployee")
    public EmployeeData addEmployee(@RequestBody EmployeeData employeeData){
        return employeeService.addEmployee(employeeData);
    }
    @GetMapping("/getEmployee/{id}")
    public EmployeeDTO getEmployee(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }
}
