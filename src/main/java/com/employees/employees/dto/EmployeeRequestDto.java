package com.employees.employees.dto;

import lombok.Data;

import java.util.List;

@Data
public class EmployeeRequestDto {

    private String firstName;

    private String lastName;

    private Long salary;

    private List<PhoneRequestDto> phone;
}
