package com.example.management.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.management.dto.EmployeeDTO;
import com.example.management.model.EmployeeData;
import com.example.management.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/addEmployee")
    public ResponseEntity<EmployeeData> addEmployee(@Valid @RequestBody EmployeeData employeeData){
        EmployeeData savedEmployee = employeeService.addEmployee(employeeData);
        return ResponseEntity.status(201).body(savedEmployee);
    }
    @GetMapping("/getEmployee/{id}")
    public EmployeeDTO getEmployee(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }
    @GetMapping("/getEmployee")
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @PutMapping("/updateEmployee/{id}")
    public EmployeeData updateEmployee(@PathVariable Integer id, @Valid @RequestBody EmployeeData employeeData){
        return employeeService.updateEmployee(id, employeeData);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public EmployeeData deleteEmployee(@PathVariable Integer id){
        return employeeService.deleteEmployee(id);
    }

}
