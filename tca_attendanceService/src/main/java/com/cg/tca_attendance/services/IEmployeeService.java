package com.cg.tca_attendance.services;

import java.util.List;

import com.cg.tca_attendance.entities.AttendanceDetails;
import com.cg.tca_attendance.entities.Employees;

public interface IEmployeeService {
	public Employees viewEmployeeById(long empId);
	public void addEmployee(Employees employee);
	public boolean validateEmployeeById(long empId);
	public List<Employees> viewEmployeesUnderSupervisior(long supervisiorId);
	public boolean validateSupervisior(long supervisiorId);
	public List<AttendanceDetails> viewAttendanceByEmpId(long empId);
}
