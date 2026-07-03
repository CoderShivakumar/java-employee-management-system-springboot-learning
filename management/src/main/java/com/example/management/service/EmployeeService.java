package com.example.management.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.management.dto.EmployeeDTO;
import java.util.List;
import java.util.ArrayList;
import com.example.management.model.EmployeeData;
import com.example.management.repository.EmployeeRepository;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public EmployeeData addEmployee(EmployeeData employeeData){
        return employeeRepository.save(employeeData);
    }
    public EmployeeData updateEmployee(Integer id, EmployeeData employeeData){
        EmployeeData existingEmployee=employeeRepository.findById(id).orElse(null);
        if(existingEmployee!=null){
            existingEmployee.setName(employeeData.getName());
            existingEmployee.setDepartment(employeeData.getDepartment());
            existingEmployee.setSalary(employeeData.getSalary());
            existingEmployee.setEmail(employeeData.getEmail());
            existingEmployee.setPhoneNumber(employeeData.getPhoneNumber());
            existingEmployee.setAge(employeeData.getAge());
            return employeeRepository.save(existingEmployee);
        }
        return null;
    }
    public EmployeeData deleteEmployee(Integer id){
        EmployeeData existingEmployee=employeeRepository.findById(id).orElse(null);
        if(existingEmployee!=null){
            employeeRepository.delete(existingEmployee);
            return existingEmployee;
        }
        return null;
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
    public List<EmployeeDTO>getAllEmployees(){
        List<EmployeeData> employeeDataList=employeeRepository.findAll();
        List<EmployeeDTO>employeeDTOList=new ArrayList<>();
        for(EmployeeData employeeData:employeeDataList){
            EmployeeDTO employeeDTO=new EmployeeDTO();
            employeeDTO.setName(employeeData.getName());
            employeeDTO.setDepartment(employeeData.getDepartment());
            employeeDTO.setSalary(employeeData.getSalary());
            employeeDTO.setEmail(employeeData.getEmail());
            employeeDTO.setPhoneNumber(employeeData.getPhoneNumber());
            employeeDTO.setAge(employeeData.getAge());
            employeeDTOList.add(employeeDTO);
        }
        return employeeDTOList;
    }
}
