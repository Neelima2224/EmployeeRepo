package com.employees.employees.dto;

import lombok.Data;

@Data
public class PhoneRequestDto {

    private String type;

    private Long areaCode;

    private Long phoneNumber;
}
