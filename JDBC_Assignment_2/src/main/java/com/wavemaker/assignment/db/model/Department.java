package com.wavemaker.assignment.db.model;

public class Department {
    private String dept_ID;
    private String dept_name;
    private String dept_domain;

    public Department() {
    }

    public Department(String dept_ID, String dept_name, String dept_domain) {
        this.dept_ID = dept_ID;
        this.dept_name = dept_name;
        this.dept_domain = dept_domain;
    }

    public String getDepartmentID() {
        return dept_ID;
    }

    public void setDepartmentID(String dept_ID) {
        this.dept_ID = dept_ID;
    }

    public String getDepartmentName() {
        return dept_name;
    }

    public void setDepartmentName(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDepartmentDomain() {
        return dept_domain;
    }

    public void setDepartmentDomain(String dept_domain) {
        this.dept_domain = dept_domain;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept_ID=" + dept_ID +
                ", dept_name='" + dept_name + '\'' +
                ", dept_domain='" + dept_domain + '\'' +
                '}';
    }
}
