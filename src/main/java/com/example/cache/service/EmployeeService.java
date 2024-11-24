package com.example.cache.service;

import com.example.cache.entity.Employee;
import com.example.cache.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @CachePut(cacheNames = "employees", key = "#employee.empId")
    public Employee updateEmployee(Employee employee) {
        System.out.println("Update API Redis Database calling...");
        return employeeRepository.save(employee);
    }

    @Cacheable(cacheNames = "employees", key = "#empId")
    public Employee getEmployee(Integer empId) {
        System.out.println("Get API Redis Database calling...");
        return employeeRepository.findById(empId).get();
    }

    @CacheEvict(cacheNames = "employees", key = "#empId")
    public String deleteEmployee(Integer empId) {
        System.out.println("Delete API Redis Database calling...");
        employeeRepository.deleteById(empId);
        return "Employee Deleted Successfully";
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
