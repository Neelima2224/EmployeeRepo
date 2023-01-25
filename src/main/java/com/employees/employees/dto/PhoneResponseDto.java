package com.employees.employees.dto;

import lombok.Data;

@Data
public class PhoneResponseDto {

    private Long id;

    private String type;

    private Long areaCode;

    private Long phoneNumber;
}
