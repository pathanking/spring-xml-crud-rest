package com.cwt.springxmlcrudrest.controller;

import com.cwt.springxmlcrudrest.model.Employee;
import com.cwt.springxmlcrudrest.model.Employees;
import com.cwt.springxmlcrudrest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employees", produces = MediaType.APPLICATION_XML_VALUE)
    public Employees findEmployees(){
        return employeeService.findAll();
    }

    @GetMapping(value="/employees/{empId}", produces = MediaType.APPLICATION_XML_VALUE)
    public Employee findEmployee(@PathVariable Long empId){
        return employeeService.findById(empId);
    }
}
