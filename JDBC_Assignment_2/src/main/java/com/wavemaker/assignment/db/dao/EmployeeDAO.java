package com.wavemaker.assignment.db.dao;
import com.wavemaker.assignment.db.model.Employee;
import java.util.*;
import java.sql.SQLException;

public interface EmployeeDAO {
    public List<Employee> getListOfEmployees();

    public void createEmployee(String ID, String first_name, String last_name,
                               String date_of_birth, String company_name, String blood_group) throws SQLException;
    public void updateEmployeeAddress(String ID, String door_no, String street_name, String city_name,
                                      String state_name, String pin_code, String landmark) throws SQLException;
    public void updateEmployeeDepartment(String ID, String dept_ID, String dept_name, String dept_domain) throws SQLException;
    public void updateEmployeeDetails(String ID, String first_name, String last_name,
                                      String date_of_birth, String company_name, String blood_group) throws SQLException;
    public void deleteEmployeeDetails(String ID) throws SQLException;
}
