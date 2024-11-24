package com.example.cache.controller;

import com.example.cache.entity.Employee;
import com.example.cache.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;
//We can not do cache implementation on saving mechanism(post)
    @PostMapping("/saveEmployee")
    public Employee saveEmp(@RequestBody Employee employee) {
        return employeeService.saveEmployee ( employee );
    }

    @PutMapping("/update")
    public Employee updateEmp(@RequestBody Employee employee) {
        return employeeService.updateEmployee ( employee );
    }

    @GetMapping("/get/{empId}")
    public Employee getEmployee(@PathVariable Integer empId) {
        return employeeService.getEmployee ( empId );
    }

    @DeleteMapping("/delete/{empId}")
    public String deleteEmployee(@PathVariable Integer empId) {
        return employeeService.deleteEmployee ( empId );
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees ();
    }
}
