package dev.employee.ManagementEmployeeList.repository;

import dev.employee.ManagementEmployeeList.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
