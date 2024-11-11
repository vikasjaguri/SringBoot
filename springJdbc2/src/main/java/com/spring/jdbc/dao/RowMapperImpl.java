package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.spring.jdbc.entities.Employee;

public class RowMapperImpl implements RowMapper<Employee> {

    @Override
    @Nullable
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setEid(rs.getInt("eid"));
        employee.setEname(rs.getString("ename"));
        employee.setDname(rs.getString("dname"));
        return employee;
    }
}
