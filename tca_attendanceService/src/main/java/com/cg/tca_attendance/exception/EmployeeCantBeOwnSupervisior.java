package com.cg.tca_attendance.exception;

public class EmployeeCantBeOwnSupervisior extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EmployeeCantBeOwnSupervisior()
	{
		super();
	}
	public EmployeeCantBeOwnSupervisior(String message)
	{
		super(message);
	}

}
