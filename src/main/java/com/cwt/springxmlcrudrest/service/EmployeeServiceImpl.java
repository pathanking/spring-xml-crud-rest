package com.cwt.springxmlcrudrest.service;

import com.cwt.springxmlcrudrest.model.Employee;
import com.cwt.springxmlcrudrest.model.Employees;
import com.cwt.springxmlcrudrest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employees findAll() {
         List<Employee> employeeList = repository.findAll();
         Employees employees = new Employees();
         employees.setEmployees(employeeList);
         return employees;
    }

    @Override
    public Employee findById(Long id) {
        return repository.findById(id).get();
    }
}
