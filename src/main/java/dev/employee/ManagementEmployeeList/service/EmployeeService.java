package dev.employee.ManagementEmployeeList.service;

import dev.employee.ManagementEmployeeList.model.Employee;
import dev.employee.ManagementEmployeeList.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    //List
    public List<Employee> getAll() {return employeeRepository.findAll();}
    //Create
    public Employee save(Employee employee) {return employeeRepository.save(employee);}
    //Delete
    public void delete(Long id) {employeeRepository.deleteById(id);}
}
