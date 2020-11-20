package com.cg.tca_attendance.services;

import java.util.List;

import com.cg.tca_attendance.entities.AttendanceDetails;
import com.cg.tca_attendance.entities.Employees;
/**
 * This interface is a structure for EmployeeService
 * @author Suparna Arya
 *
 */
public interface IEmployeeService {
	 /**
     * This method is used to view Employee using empId
     * @param employee
     */
	public Employees viewEmployeeById(long empId);
	/**
	 * This method add employee
	 * @param employee
	 */
	public void addEmployee(Employees employee);
	/**
     * This method validate employeeId with condition applied
     * @param empId
     * @return String of message
     */

	public String validateEmployeeById(long empId);
	/**
	 * This method is used to view Employees working under a supervisor using supervisor id
	 * @param supervisiorId
	 * @return List of Employees
	 */
	public List<Employees> viewEmployeesUnderSupervisior(long supervisiorId);
	/**
	 * This method validate SupervisorId with condition applied
	 * @param emp
	 * @param supervisiorId
	 * @return String of message
	 */

	public String validateSupervisior(Employees emp, long supervisiorId);
	/**
	 * This method is used to view AttendanceDetails using employeeId
	 * @param empId
	 * @return List of AttendanceDetails
	 */
	public List<AttendanceDetails> viewAttendanceByEmpId(long empId);
}
