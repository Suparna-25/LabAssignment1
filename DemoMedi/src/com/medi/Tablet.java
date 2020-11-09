package com.medi;

public class Tablet extends Medicine {

	private String info = "Store in cool and dry place.";

	public Tablet(String mediName, double mediPrice, String companyName, String expiryDate)
			throws InvalidPriceException {

		super(mediName, mediPrice, companyName, expiryDate);
	}

	public String displayMedicineInfo() {
		String print = super.displayMedicineInfo() + info;

		return print;
	}
}
