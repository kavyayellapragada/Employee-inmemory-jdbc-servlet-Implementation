package com.wavemaker.assignment;
import com.wavemaker.assignment.memory.dao.EmployeeDAO;
import com.wavemaker.assignment.memory.dao.EmployeeDAOImpl;
import com.wavemaker.assignment.memory.model.Employee;
import java.sql.SQLException;
import java.util.*;
public class MainMemory {
    public void execute() throws SQLException {
        System.out.println("Main Memory Program");
        EmployeeDAO employeeMemoryDAOImpl = new EmployeeDAOImpl();
        Scanner inpt = new Scanner(System.in);
        Scanner inpt1 = new Scanner(System.in);
        Employee emp = new Employee();
        int i = 0;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.UPDATE");
            System.out.println("5.DELETE");
            System.out.println("6.EXIT");

            int choice = inpt.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Id:");
                    emp.setId(inpt.nextInt());
                    System.out.print("Enter Employee name:");
                    emp.setName(inpt1.nextLine());
                    employeeMemoryDAOImpl.addEmployee(emp);
                    break;
                case 2:
                    employeeMemoryDAOImpl.listEmployees();
                    break;
                case 3:
                    System.out.println("Search Employee Name");
                    employeeMemoryDAOImpl.searchEmployees("Kavya");
                    break;
                case 4:
                    Employee newEmp=new Employee();
                    System.out.println("Update Employee");
                    newEmp.setId(1);
                    newEmp.setName("Kavya");
                    employeeMemoryDAOImpl.updateEmployee(newEmp);
                    break;
                case 5:

                    System.out.println("Delete Employee ID");
                    int id=inpt.nextInt();
                    employeeMemoryDAOImpl.deleteEmployee(id);
                    break;
                case 6:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
            }
        } while (i != 6);
    }
}
