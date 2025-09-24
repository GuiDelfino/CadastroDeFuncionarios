package dev.employee.ManagementEmployeeList.controller;

import dev.employee.ManagementEmployeeList.model.Employee;
import dev.employee.ManagementEmployeeList.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    public final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAll() {return employeeService.getAll();}
    @PostMapping
    public Employee create(@RequestBody Employee employee) {return employeeService.save(employee);}
}
