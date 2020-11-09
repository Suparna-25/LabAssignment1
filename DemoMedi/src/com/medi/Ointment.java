package com.medi;

public class Ointment extends Medicine {

	private String info = "For external use only";

	public Ointment(String mediName, double mediPrice, String companyName, String expiryDate)
			throws InvalidPriceException {
		super(mediName, mediPrice, companyName, expiryDate);
	}

	public String displayMedicineInfo() {
		String print = super.displayMedicineInfo() + info;

		return print;
	}

}
