package com.employees.employees.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@NamedQuery(name = "Employee.findAll", query = "SELECT a FROM Employee a")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;


    @Column(name = "first_name")
    private String firstName;


    @Column(name = "last_name")
    private String lastName;


    @Column(name = "salary")
    private Long salary;
}
