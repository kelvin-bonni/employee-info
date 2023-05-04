package com.challenge.dcscodechallenge.service;

import com.challenge.dcscodechallenge.model.Employee;

import java.util.Collection;
import java.util.Optional;

public interface EmployeeService {
    Collection<Employee> getEmployees();

    Optional<Employee> findById(Long id);

    Employee addEmployee(Employee employee);
}
