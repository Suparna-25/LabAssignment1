package com.cg.tca_attendanceService.services;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.tca_attendance.entities.Employees;
import com.cg.tca_attendance.services.EmployeeService;
import com.cg.tca_attendance.services.IEmployeeService;

public class EmployeeServiceTest {

	IEmployeeService emp = new EmployeeService();
	Employees emps = new Employees();

	@Test
	public void test() {
		emps.setEmpId(234L);
		assertEquals("Correct Employee Id", emp.validateEmployeeById(emps.getEmpId()));

	}

}
