package com.medi;

public class InvalidPriceException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidPriceException() {

	}

	public InvalidPriceException(String message) {
		super(message);
	}

}
