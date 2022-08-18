package com.wavemaker.assignment.memory.dao;
import com.wavemaker.assignment.memory.model.Employee;
import com.wavemaker.assignment.memory.dao.EmployeeDAO;
import java.util.*;
public class EmployeeDAOImpl implements EmployeeDAO {
    private List<Employee> employeesList = new ArrayList<>();

    @Override
    public List<Employee> addEmployee(Employee emp1) {
        employeesList.add(emp1);
        return employeesList;
    }

    @Override
    public void updateEmployee(Employee emp) {
        ListIterator<Employee> empListIterator = employeesList.listIterator();
        while (empListIterator.hasNext()) {
            Employee existingEmp = empListIterator.next();
            if (existingEmp.getId() == emp.getId()) {
                //empListIterator.set(emp);
                existingEmp.setName(emp.getName());
            }
        }
    }

    @Override
    public List<Employee> listEmployees() {
        System.out.println(employeesList);
        return employeesList;
    }

    @Override
    public void deleteEmployee(int id) {
        boolean flag=false;
        Iterator<Employee> empIterator = employeesList.iterator();
        while (empIterator.hasNext()) {
            Employee eId = empIterator.next();
            System.out.println(eId.getId());
            System.out.println();
            if (eId.getId() == id) {
                flag = true;
                empIterator.remove();
                break;
            }
        }
        if (flag == true) {
            System.out.println(employeesList);
        }
        else {
            System.out.println("NOT FOUND");
        }
    }

    @Override
    public List<Employee> searchEmployees(String searchWord) {
        ArrayList<Employee> searchlist = new ArrayList<Employee>();
        boolean flag = false;
        Iterator<Employee> empIterator = employeesList.iterator();
        while (empIterator.hasNext()) {
            Employee emp = empIterator.next();
            if (emp.getName() == searchWord) {
                flag = true;
                searchlist.add(emp);
                break;
            }
        }
        if (flag == true) {
            System.out.println(searchlist);
        } else {
            System.out.println("Not Found");
        }
        return searchlist;
    }
}
