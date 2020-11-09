package ques1;

public class Student {
	private String firstName;
	private String lastName;
	private int score;

	public Student(String firstName, String lastName, int score) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setScore(score);

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
