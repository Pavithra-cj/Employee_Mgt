package lk.itzcorpio.employee.backend.services;

import lk.itzcorpio.employee.backend.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
