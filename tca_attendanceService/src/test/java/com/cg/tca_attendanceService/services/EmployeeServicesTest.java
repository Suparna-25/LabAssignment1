package com.cg.tca_attendanceService.services;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.tca_attendance.entities.Employees;
import com.cg.tca_attendance.services.EmployeeService;
import com.cg.tca_attendance.services.IEmployeeService;

public class EmployeeServicesTest {

	IEmployeeService emp = new EmployeeService();
	Employees employ = new Employees();

	@Test
	public void test() {
		employ.setEmpId(0L);
		assertEquals("null", emp.validateEmployeeById(employ.getEmpId()));

	}

}
