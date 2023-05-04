package com.challenge.dcscodechallenge.exception;

import com.challenge.dcscodechallenge.model.Employee;
import lombok.Getter;

@Getter
public class DuplicateBookException extends RuntimeException {
    private final Employee employee;

    public DuplicateBookException(Employee employee) {
        this.employee = employee;
    }
}