package com.employees.employees.controller;

import com.employees.employees.dto.EmployeeRequestDto;
import com.employees.employees.dto.EmployeeResponseDto;
import com.employees.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public EmployeeResponseDto add(@RequestBody EmployeeRequestDto employeeRequestDto) {
        return employeeService.create(employeeRequestDto);

    }
}
