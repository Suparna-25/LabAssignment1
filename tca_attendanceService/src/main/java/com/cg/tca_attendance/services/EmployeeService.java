package com.cg.tca_attendance.services;

import java.util.ArrayList;
import java.util.List;

import com.cg.tca_attendance.entities.Employees;
import com.cg.tca_attendance.repository.EmployeeRepository;

public class EmployeeService implements IEmployeeService{
	private EmployeeRepository rep;
	public EmployeeService() {
		rep=new EmployeeRepository();
	}

	@Override
	public Employees viewEmployeeById(long emp_Id) {
	 Employees emp=rep.findEmployeeById(emp_Id);
		return emp;
	}

	@Override
	public void addEmployee(Employees employee) {
		rep.addEmployee(employee);
		
	}

	@Override
	public boolean validateEmployeeById(long emp_Id) {
		if(emp_Id>0)
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
	public boolean validateSupervisior(long Supervisior_id) {
		List<Employees> emp=new ArrayList<>();
		for(Employees e:emp)
		{
			if(e.getEmp_Id()==Supervisior_id)
			{
				return true;
			}
		}
		return false;
	}
	
}
