package com.employees.employees.dto;

import lombok.Data;

import java.util.List;

@Data
public class EmployeeResponseDto {

    private Long id;

    private String firstName;

    private String lastName;

    private Long salary;

    private List<PhoneResponseDto> phone;

}
