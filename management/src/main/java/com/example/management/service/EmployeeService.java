package com.example.management.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.management.dto.EmployeeDTO;
import com.example.management.model.EmployeeData;
import com.example.management.repository.EmployeeRepository;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public EmployeeData addEmployee(EmployeeData employeeData){
        return employeeRepository.save(employeeData);
    }
    public EmployeeDTO getEmployee(Integer id){
        EmployeeData employeeData=employeeRepository.findById(id).orElse(null);
        if(employeeData==null){
            return null;
        }
        else{
            EmployeeDTO employeeDTO=new EmployeeDTO();
            employeeDTO.setName(employeeData.getName());
            employeeDTO.setDepartment(employeeData.getDepartment());
            employeeDTO.setSalary(employeeData.getSalary());
            employeeDTO.setEmail(employeeData.getEmail());
            employeeDTO.setPhoneNumber(employeeData.getPhoneNumber());
            employeeDTO.setAge(employeeData.getAge());
            return employeeDTO;
        }
    }
}
