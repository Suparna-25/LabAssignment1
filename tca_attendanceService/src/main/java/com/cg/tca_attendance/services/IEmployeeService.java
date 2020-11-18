package com.cg.tca_attendance.services;

import java.util.List;

import com.cg.tca_attendance.entities.Employees;

public interface IEmployeeService {
	public Employees viewEmployeeById(long emp_Id);
	public void addEmployee(Employees employee);
	public boolean validateEmployeeById(long emp_Id);
	public List<Employees> viewEmployeesUnderSupervisior(long supervisiorId);
	public boolean validateSupervisior(long Supervisior_id);
}
