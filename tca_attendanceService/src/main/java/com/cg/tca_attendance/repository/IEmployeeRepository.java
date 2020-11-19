package com.cg.tca_attendance.repository;


import java.util.List;

import com.cg.tca_attendance.entities.AttendanceDetails;
import com.cg.tca_attendance.entities.Employees;

public interface IEmployeeRepository {
	
	public Employees findEmployeeById(long empId);
	public void addEmployee(Employees employee);
	public List<Employees> findEmployeesUnderSupervisior(long supervisiorId);
	public void beginTransaction();
	public void commitTransaction();
	

}
