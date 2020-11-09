package ques3;

public class Source {

	public String searchForJob(int age, String highestQualification) {
		String message = null;
		try {

			if (age >= 200 || age <= 0) {
				message = "The age entered is not typical for a human being";
				throw new NotEligibleException();

			} else {

				message = CompanyJobRepository.getJobPrediction(age, highestQualification);
			}
		} catch (NotEligibleException e) {

			System.out.println(e.getMessage());
			message = "";

		}
		return message;
	}

}
