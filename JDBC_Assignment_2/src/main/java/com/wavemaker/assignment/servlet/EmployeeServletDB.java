package com.wavemaker.assignment.servlet;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wavemaker.assignment.db.dao.EmployeeDAO;
import com.wavemaker.assignment.db.dao.EmployeeDAOImpl;
import com.wavemaker.assignment.db.model.Employee;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class EmployeeServletDB extends HttpServlet {
    private EmployeeDAO dbManager = new EmployeeDAOImpl();

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Employee> emps = dbManager.getListOfEmployees();
        response.getWriter().write(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emps));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Employee emp = objectMapper.readValue(request.getReader(), Employee.class);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    try {
        dbManager.createEmployee(emp.getId(),emp.getFirstName(),emp.getLastName(),emp.getDOB(),
                emp.getCompanyName(),emp.getBloodGroup());
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    }

    @Override
    protected void doDelete(HttpServletRequest request,HttpServletResponse  response) throws IOException
    {
        Employee emp = objectMapper.readValue(request.getReader(),Employee.class);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            dbManager.deleteEmployeeDetails(emp.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

