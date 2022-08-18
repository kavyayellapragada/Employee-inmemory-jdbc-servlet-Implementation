package com.wavemaker.assignment;
import com.wavemaker.assignment.db.dao.EmployeeDAOImpl;
import com.wavemaker.assignment.db.model.Employee;

import java.sql.SQLException;
import java.util.*;

public class MainDB {
    private EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

    //This method creates new employees in database
    public void createNewEmployee() throws SQLException {
        Scanner i = new Scanner(System.in);
        System.out.println("Creating record for new employee");
        System.out.println("**********************************************************");
        System.out.println("Please enter ID number");
        String ID = i.next();
        System.out.println("Please enter first name");
        String first_name = i.next();
        System.out.println("Please enter last name");
        String last_name = i.next();
        System.out.println("Please enter DOB");
        String date_of_birth = i.next();
        System.out.println("Please enter Company name");
        String company_name = i.next();
        System.out.println("Please enter Blood Group");
        String blood_group = i.next();
        employeeDAO.createEmployee(ID, first_name, last_name, date_of_birth, company_name, blood_group);
    }

    //This method lists all employee details present in database
    public void listEmployees() {
        System.out.println("List of Employees in database");
        System.out.println("**********************************************************");
        List<Employee> listOfEmployees = employeeDAO.getListOfEmployees();
        if(listOfEmployees != null) {
            for (Employee employee : listOfEmployees) {
                System.out.println(employee);
            }
        }
    }

    //This method updates address details of employees in database
    public void updateAddressOfEmployee() throws SQLException {
        Scanner i = new Scanner(System.in);
        System.out.println("Please enter details of Address that you want to update");
        System.out.println("**********************************************************");
        System.out.println("Please enter ID number of employee whose address needs update");
        String ID = i.next();
        System.out.println("Please enter door number");
        String door_no = i.next();
        System.out.println("Please enter street name");
        String street_name = i.next();
        System.out.println("Please enter city name");
        String city_name = i.next();
        System.out.println("Please enter state");
        String state_name = i.next();
        System.out.println("Please enter pin code");
        String pin_code = i.next();
        System.out.println("Please enter landmark");
        String landmark = i.next();
        employeeDAO.updateEmployeeAddress(ID, door_no, street_name, city_name, state_name, pin_code, landmark);
    }

    //This method updates department details of employees in database
    public void updateDepartmentOfEmployee() throws SQLException {
        Scanner i = new Scanner(System.in);
        System.out.println("Please enter details of Department that you want to update");
        System.out.println("**********************************************************");
        System.out.println("Please enter ID number of employee whose department needs update");
        String ID = i.next();
        System.out.println("Please enter new Department ID number");
        String dept_ID = i.next();
        System.out.println("Please enter new Department name");
        String dept_name = i.next();
        System.out.println("Please enter new domain");
        String dept_domain = i.next();
        employeeDAO.updateEmployeeDepartment(ID, dept_ID, dept_name, dept_domain);
    }

    //This method updates employees details in database
    public void updateEmployee() throws SQLException {
        Scanner i = new Scanner(System.in);
        System.out.println("Please enter details of employee you want to update");
        System.out.println("**********************************************************");
        System.out.println("Please enter ID number");
        String ID = i.next();
        System.out.println("Please enter first name");
        String first_name = i.next();
        System.out.println("Please enter last name");
        String last_name = i.next();
        System.out.println("Please enter DOB");
        String date_of_birth = i.next();
        System.out.println("Please enter Company name");
        String company_name = i.next();
        System.out.println("Please enter Blood Group");
        String blood_group = i.next();
        employeeDAO.updateEmployeeDetails(ID, first_name, last_name, date_of_birth, company_name, blood_group);
    }

    //This method deletes employees details in database
    public  void deleteEmployee() throws SQLException {
        Scanner i = new Scanner(System.in);
        System.out.println("Please enter ID number of Employee you want to delete");
        System.out.println("**********************************************************");
        String ID = i.next();
        employeeDAO.deleteEmployeeDetails(ID);
    }

    public void execute() throws SQLException {
        System.out.println("Main DB Program");
        new MainDB().listEmployees();
        //new Main().createNewEmployee();
        //new Main().updateEmployee();
        //new Main().deleteEmployee();
        //new Main().updateAddressOfEmployee();
        //new Main().updateDepartmentOfEmployee();
    }
}
