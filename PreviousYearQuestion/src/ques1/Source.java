package ques1;

import java.util.ArrayList;
import java.util.List;

public class Source {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Smith", "John", 60));
		students.add(new Student("Dean", "James", 80));
		students.add(new Student("Jennifer", "David", 72));
		students.add(new Student("Smith", "John", 70));
		StudentImplementation si = new StudentImplementation();
		System.out.println("Sum of 70 above sore is " + si.sumScore(students));
		System.out.println("List of full name of students" + si.listName(students));

	}

}
