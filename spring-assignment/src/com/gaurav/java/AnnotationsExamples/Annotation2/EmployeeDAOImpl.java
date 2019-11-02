package com.gaurav.java.AnnotationsExamples.Annotation2;

import org.springframework.stereotype.Repository;

@Repository ("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO
{
    public EmployeeDTO createNewEmployee()
    {
        EmployeeDTO e = new EmployeeDTO();
        e.setId(9);
        e.setFirstName("Gaurav");
        e.setLastName("Tomar");
        return e;
    }
}
