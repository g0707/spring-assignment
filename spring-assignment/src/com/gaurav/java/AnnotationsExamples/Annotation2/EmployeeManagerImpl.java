package com.gaurav.java.AnnotationsExamples.Annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service ("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager
{
    @Autowired
    EmployeeDAO dao;
     
    public EmployeeDTO createNewEmployee()
    {
        return dao.createNewEmployee();
    }
}
