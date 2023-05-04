package com.challenge.dcscodechallenge.repository;

import com.challenge.dcscodechallenge.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
