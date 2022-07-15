package com.cwt.springxmlcrudrest.service;

import com.cwt.springxmlcrudrest.model.Employee;
import com.cwt.springxmlcrudrest.model.Employees;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    Employees findAll();
    Employee findById(Long id);

    Employee save(Employee employee);
}
