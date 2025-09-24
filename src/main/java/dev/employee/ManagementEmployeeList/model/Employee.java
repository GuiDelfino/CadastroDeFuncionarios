package dev.employee.ManagementEmployeeList.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee {
    private long id;
    private String employee;
    private String position;
    private int age;
    private String email;
}
