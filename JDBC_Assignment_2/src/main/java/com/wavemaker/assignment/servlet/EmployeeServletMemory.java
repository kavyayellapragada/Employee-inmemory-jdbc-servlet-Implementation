package com.wavemaker.assignment.servlet;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wavemaker.assignment.memory.dao.EmployeeDAO;
import com.wavemaker.assignment.memory.dao.EmployeeDAOImpl;
import com.wavemaker.assignment.memory.model.Employee;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class EmployeeServletMemory extends HttpServlet {
    private EmployeeDAO memoryManager = new EmployeeDAOImpl();

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Employee> emps = memoryManager.listEmployees();
        response.getWriter().write(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emps));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Employee emp = objectMapper.readValue(request.getReader(), Employee.class);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        memoryManager.addEmployee(emp);

    }

    @Override
    protected void doDelete(HttpServletRequest request,HttpServletResponse  response) throws IOException
    {
        Employee emp = objectMapper.readValue(request.getReader(),Employee.class);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        memoryManager.deleteEmployee(emp.getId());
    }
}


