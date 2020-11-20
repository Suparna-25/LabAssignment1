package com.cg.tca_attendance.services;

import java.util.ArrayList;
import java.util.List;

import com.cg.tca_attendance.entities.AttendanceDetails;
import com.cg.tca_attendance.entities.Employees;
import com.cg.tca_attendance.exception.EmployeeCantBeOwnSupervisior;
import com.cg.tca_attendance.exception.InvalidEmployeeId;
import com.cg.tca_attendance.exception.InvalidSupervisiorId;
import com.cg.tca_attendance.repository.EmployeeRepository;
import com.cg.tca_attendance.exception.InvalidEmployeeId;

public class EmployeeService implements IEmployeeService {
	private EmployeeRepository rep;

	public EmployeeService() {
		rep = new EmployeeRepository();
	}

	@Override
	public Employees viewEmployeeById(long empId) {
		Employees emp = rep.findEmployeeById(empId);
		return emp;
	}

	@Override
	public void addEmployee(Employees employee) {
		rep.addEmployee(employee);
		String validateSup = validateSupervisior(employee, employee.getSupervisiorId());
		System.out.println(validateSup);

	}

	@Override
	public String validateEmployeeById(long empId) {
		String message = null;
		try {
			if (empId > 0) {
				message = "Correct Employee Id";
			} else {

				throw new InvalidEmployeeId("Employee id is invalid");
			}
		} catch (InvalidEmployeeId e) {
			System.out.println(e);
		}
		return message;

	}

	@Override
	public List<Employees> viewEmployeesUnderSupervisior(long supervisiorId) {
		List<Employees> emp = rep.findEmployeesUnderSupervisior(supervisiorId);
		return emp;
	}

	@Override
	public String validateSupervisior(Employees emp, long supervisiorId) {
		String message = null;
		try {

			if (supervisiorId > 0) {
				if (emp.getEmpId() != supervisiorId) {
					message = "Correct Supervisior Id";
				} else {
					throw new EmployeeCantBeOwnSupervisior("Employee cannot be it's own Supervisior");
				}
			} else {
				throw new InvalidSupervisiorId("Supervisior Id is not valid");
			}
		} catch (EmployeeCantBeOwnSupervisior e) {
			System.out.println(e);
		} catch (InvalidSupervisiorId e) {
			System.out.println(e);
		}

		return message;
	}

	@Override
	public List<AttendanceDetails> viewAttendanceByEmpId(long empId) {
		Employees emp = viewEmployeeById(empId);
		List<AttendanceDetails> attendance = emp.getAttendance();

		return attendance;
	}

}
