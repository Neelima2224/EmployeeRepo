package com.employees.employees.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "phone")
@NamedQuery(name = "Phone.findAll", query = "SELECT a FROM Phone a")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "area_code")
    private Long areaCode;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
