package com.example.demo.service.impl;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto)
    {
        return employeeDto;
    }
}
