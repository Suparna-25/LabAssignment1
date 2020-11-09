package ques3;

public class CompanyJobRepository {

	public static String getJobPrediction(int age, String highestQualification) throws NotEligibleException {
		String role = null;
		if (age < 19)
			throw new NotEligibleException("You are underage for any job");
		else {
			if (age >= 21 && highestQualification.equalsIgnoreCase("B.E")) {
				role = "We have openings for Junior developer";
			} else if ((age >= 26) && ((highestQualification.equalsIgnoreCase("M.S"))
					|| (highestQualification.equalsIgnoreCase("PhD")))) {
				role = "We have openings for Senior developer";
			} else if (age >= 19
					&& (!(highestQualification.equalsIgnoreCase("M.S") || highestQualification.equalsIgnoreCase("PhD")
							|| highestQualification.equalsIgnoreCase("B.E.")))) {

				throw new NotEligibleException("We do not have any job that matches your qualifications");

			} else {

				role = "Sorry we have no openings for now";
			}

		}

		return role;
	}

	public static void main(String[] args) {
		Source s = new Source();
		System.out.println(s.searchForJob(19, "B.E."));
	}
}
