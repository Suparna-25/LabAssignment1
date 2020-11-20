package com.cg.tca_attendance.exception;
/**
 * This custom exception class is thrown when an employee is not valid
 * 
 */
public class InvalidEmployeeId extends Exception {

	private static final long serialVersionUID = 1L;

	//default InvalidEmployeeId constructor
	public InvalidEmployeeId() {
		super();
	}
	/**
	 * parameterized InvalidEmployeeId constructor with message as parameter
	 * @param message
	 */
	public InvalidEmployeeId(String message) {
		super(message);
	}
}
