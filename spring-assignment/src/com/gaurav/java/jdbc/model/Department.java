package com.gaurav.java.jdbc.model;

public class Department 
{
	private String deptId;
	private String deptName;
	private String deptManagerId;
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptManagerId() {
		return deptManagerId;
	}
	public void setDeptManagerId(String deptManagerId) {
		this.deptManagerId = deptManagerId;
	}
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String deptId, String deptName, String deptManagerId) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptManagerId = deptManagerId;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptManagerId=" + deptManagerId + "]";
	}
}
