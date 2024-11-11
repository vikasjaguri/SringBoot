package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Employee;
import java.util.List;

public interface EmpDao {
    // Method to insert data
    public int insert(Employee employee);

    // Method to edit data
    public int edit(Employee employee);

    // Method to delete data
    public int delete(Employee employee);

    // Method to get a single employee by id
    public Employee getEmployee(int eid);

    // Method to get all employees
    public List<Employee> getAllEmp();
}
