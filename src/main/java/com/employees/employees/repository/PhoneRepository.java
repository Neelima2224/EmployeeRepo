package com.employees.employees.repository;

import com.employees.employees.model.Employee;
import com.employees.employees.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

    List<Phone> findByEmployee(Employee employee);
}
