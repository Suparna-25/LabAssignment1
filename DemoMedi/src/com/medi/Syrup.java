package com.medi;

public class Syrup extends Medicine {

	private String info = "Shake well before use";

	public Syrup(String mediName, double mediPrice, String companyName, String expiryDate)
			throws InvalidPriceException {
		super(mediName, mediPrice, companyName, expiryDate);
	}

	public String displayMedicineInfo() {
		String print = super.displayMedicineInfo() + info;
		// System.out.println(print);
		return print;
	}

}
