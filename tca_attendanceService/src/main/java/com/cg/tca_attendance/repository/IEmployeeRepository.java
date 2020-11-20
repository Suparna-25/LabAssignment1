package com.cg.tca_attendance.repository;

import java.util.List;

import com.cg.tca_attendance.entities.AttendanceDetails;
import com.cg.tca_attendance.entities.Employees;
/**
 * This Interface holds the structure of AttendanceDetails Repository
 * @author Suparna Arya
 *
 */
public interface IEmployeeRepository {
   /**
    * This method find Employees using empId 
    * @param empId
    * @return
    */
	public Employees findEmployeeById(long empId);
	/**
	 * This method save/add/persists attendanceDetails object in database
	 * @param employee
	 */

	public void addEmployee(Employees employee);
	/**
	 * This method finds employees working under supervisor
	 * @param supervisiorId
	 * @return
	 */

	public List<Employees> findEmployeesUnderSupervisior(long supervisiorId);
	/**
     * This method begin transaction in database
     */

	public void beginTransaction();
	/**
     * This method commit transaction in database
     */
	public void commitTransaction();

}
