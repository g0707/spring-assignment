package com.gaurav.java.AnnotationsExamples.Annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller ("employeeController")
public class EmployeeController 
{
        @Autowired
    EmployeeManager manager;
     
    public EmployeeDTO createNewEmployee()
    {
        return manager.createNewEmployee();
    }
}