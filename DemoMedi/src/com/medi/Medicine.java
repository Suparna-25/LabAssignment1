package com.medi;

public class Medicine {

	private String mediName;
	private double mediPrice;
	private String companyName;
	private String expiryDate;

	public Medicine() {

	}

	public Medicine(String mediName, double mediPrice, String companyName, String expiryDate)
			throws InvalidPriceException {
		this.mediName = mediName;
		if (mediPrice <= 0 || mediPrice > 10000) {
			throw new InvalidPriceException("Invalid Price is encounter");
		} else {
			this.mediPrice = mediPrice;
		}
		this.companyName = companyName;
		this.expiryDate = expiryDate;
	}

	public String getMediName() {
		return mediName;
	}

	public void setMediName(String mediName) {
		this.mediName = mediName;
	}

	public double getMediPrice() {
		return mediPrice;
	}

	public void setMediPrice(double mediPrice) {
		this.mediPrice = mediPrice;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Medicine [mediName=" + mediName + ", mediPrice=" + mediPrice + ", companyName=" + companyName
				+ ", expiryDate=" + expiryDate + "]";
	}

	public String displayMedicineInfo() {
		String print = null;

		try {
			Medicine m = new Medicine(mediName, mediPrice, companyName, expiryDate);
			print = m.toString();
		} catch (InvalidPriceException e) {
			System.out.println(e);
		}

		return print;

	}

}
