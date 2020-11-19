package com.cg.tca_attendance.services;

import java.util.ArrayList;
import java.util.List;

import com.cg.tca_attendance.entities.AttendanceDetails;
import com.cg.tca_attendance.entities.Employees;
import com.cg.tca_attendance.repository.EmployeeRepository;

public class EmployeeService implements IEmployeeService{
	private EmployeeRepository rep;
	public EmployeeService() {
		rep=new EmployeeRepository();
	}

	@Override
	public Employees viewEmployeeById(long empId) {
	 Employees emp=rep.findEmployeeById(empId);
		return emp;
	}

	@Override
	public void addEmployee(Employees employee) {
		rep.addEmployee(employee);
		
	}

	@Override
	public boolean validateEmployeeById(long empId) {
		if(empId>0)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public List<Employees> viewEmployeesUnderSupervisior(long supervisiorId) {
		List<Employees> emp=rep.findEmployeesUnderSupervisior(supervisiorId);
		return emp;
	}

	@Override
	public boolean validateSupervisior(long supervisiorId) {
		List<Employees> emp=new ArrayList<>();
		for(Employees e:emp)
		{
			if(e.getEmpId()!=e.getSupervisiorId())
			{
			  if(e.getEmpId()==supervisiorId)
			   {
				return true;
			   }
			}
			  else
			  {
				  return false;
			  }
		}
		return false;
	}

	@Override
	public List<AttendanceDetails> viewAttendanceByEmpId(long empId) {
		Employees emp=viewEmployeeById(empId);
		List<AttendanceDetails> attendance=emp.getAttendance();
		
		return attendance;
	}
	
}
