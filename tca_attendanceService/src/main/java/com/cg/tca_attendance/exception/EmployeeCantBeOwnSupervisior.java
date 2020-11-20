package com.cg.tca_attendance.exception;

/**
 * This custom exception class is thrown when an employee has same employeeId ad supervisiorId
 */
public class EmployeeCantBeOwnSupervisior extends Exception {

	
	private static final long serialVersionUID = 1L;
	//default EmployeeCantBeOwnSupervisior constructor
	public EmployeeCantBeOwnSupervisior()
	{
		super();
	}
	/**
	 * parameterized EmployeeCantBeOwnSupervisior constructor with message as parameter
	 * @param message
	 */
	public EmployeeCantBeOwnSupervisior(String message)
	{
		super(message);
	}

}
