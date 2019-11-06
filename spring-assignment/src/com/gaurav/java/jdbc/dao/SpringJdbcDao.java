package com.gaurav.java.jdbc.dao;

import java.util.List;

import com.gaurav.java.jdbc.model.Employee;

public interface SpringJdbcDao
{
	    public void saveEmployee(Employee employee);
	    public Employee getEmployeeById(int id);
	    public void updateEmployee(Employee employee);
	    public void deleteEmployee(int id);
	    public List<Employee> getAllEmployees();
	}
