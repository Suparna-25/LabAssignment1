package com.medi;

import java.util.Scanner;

public class MedicineClient {

	public static void main(String[] args) {

		// Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of medicine you want");
		int n = sc.nextInt();
		Medicine[] med = new Medicine[n];
		// Medicine me = new Medicine();
		for (int i = 0; i < n; i++) {

			System.out.println("1.Tablet\n2.Syrup\n3.Ointment");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				try {
					med[i] = new Tablet("Aspirin Tablet", 20.0, "Bayer", "02/2025");
				} catch (InvalidPriceException e) {

					e.printStackTrace();
				}
				String disp = med[i].displayMedicineInfo();
				System.out.println(disp);
				break;
			case 2:

				try {
					med[i] = new Syrup("Cough Syrup", 70.0, "Bufferin", "06/2023");
				} catch (InvalidPriceException e) {

					e.printStackTrace();
				}
				String disp2 = med[i].displayMedicineInfo();
				System.out.println(disp2);
				break;
			case 3:
				try {
					med[i] = new Ointment("Skincare Oinment", 80.0, "Devex", "08/2022");
				} catch (InvalidPriceException e) {
					e.printStackTrace();
				}
				String disp3 = med[i].displayMedicineInfo();
				System.out.println(disp3);
				break;
			}
		}
		sc.close();
	}
}
