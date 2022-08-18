package com.wavemaker.assignment.memory.dao;
import com.wavemaker.assignment.memory.model.Employee;
import java.util.*;
public interface EmployeeDAO {
    List<Employee> addEmployee(Employee emp1);
    void updateEmployee(Employee emp);
    List<Employee> listEmployees();
    void deleteEmployee(int id);
    List<Employee> searchEmployees(String keyword);
}
