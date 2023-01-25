package com.employees.employees.service;

import com.employees.employees.dto.EmployeeRequestDto;
import com.employees.employees.dto.EmployeeResponseDto;
import com.employees.employees.dto.PhoneRequestDto;
import com.employees.employees.dto.PhoneResponseDto;
import com.employees.employees.model.Employee;
import com.employees.employees.model.Phone;
import com.employees.employees.repository.EmployeeRepository;
import com.employees.employees.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    PhoneRepository phoneRepository;


    private Employee convertedEmployees(EmployeeRequestDto employeeRequestDto) {
        Employee employee = new Employee();
        employee.setFirstName(employeeRequestDto.getFirstName());
        employee.setLastName(employeeRequestDto.getLastName());
        employee.setSalary(employeeRequestDto.getSalary());

        return employee;
    }

    public EmployeeResponseDto create(EmployeeRequestDto employeeRequestDto) {
        Employee employeeResponseDto = employeeRepository.save(convertedEmployees(employeeRequestDto));
        return transformEmployeesResponse(employeeResponseDto);
    }

    private EmployeeResponseDto transformEmployeesResponse(Employee employee) {
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
        employeeResponseDto.setId(employee.getId());
        employeeResponseDto.setFirstName(employee.getFirstName());
        employeeResponseDto.setLastName(employee.getLastName());
        employeeResponseDto.setSalary(employee.getSalary());
      /*  List<Phone> phoneList = phoneRepository.findByEmployee(employee);
        employeeResponseDto.setPhone(this.convertedPhone(phoneList));*/

        return employeeResponseDto;
    }

    private Phone convertedPhone(PhoneRequestDto phoneRequestDto) {
        Phone phone = new Phone();
        phone.setType(phoneRequestDto.getType());
        phone.setAreaCode(phoneRequestDto.getAreaCode());
        phone.setPhoneNumber(phoneRequestDto.getPhoneNumber());

        return phone;
    }

    public PhoneResponseDto add(PhoneRequestDto phoneRequestDto) {
        Phone phone1 = phoneRepository.save(convertedPhone(phoneRequestDto));
        return transformPhoneResponse(phone1);
    }

    private PhoneResponseDto transformPhoneResponse(Phone phone) {
        PhoneResponseDto phoneResponseDto = new PhoneResponseDto();
        phoneResponseDto.setId(phone.getId());
        phoneResponseDto.setType(phone.getType());
        phoneResponseDto.setAreaCode(phone.getAreaCode());
        phoneResponseDto.setPhoneNumber(phone.getPhoneNumber());
        return phoneResponseDto;


    }
}
