package com.cg.tca_attendance.exception;
/**
 *  This custom exception class is thrown when an supervisor is not valid
 */
public class InvalidSupervisiorId extends Exception {

	
	private static final long serialVersionUID = 1L;
	//default InvalidSupervisiorId constructor
	public InvalidSupervisiorId() {
		super();
	}
	/**
	 * parameterized InvalidSupervisiorId constructor with message as parameter
	 * @param message
	 */
	public InvalidSupervisiorId(String message) {
		super(message);
	}

}
