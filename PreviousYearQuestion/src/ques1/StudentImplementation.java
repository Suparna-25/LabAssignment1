package ques1;

import java.util.ArrayList;
import java.util.List;

public class StudentImplementation {
//	int sumScore(List<Student> list) {
//		int sum = 0;
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getScore() > 70) {
//				sum += list.get(i).getScore();
//			}
//		}
//
//		return sum;
	List<Student> list = new ArrayList<Student>();
	Integer score = list.stream().filter(x -> x.getScore() > 70).map(y -> y.getScore()).reduce(0, Integer::sum);

}

//	List<String> listName(List<Student> list) {
//		List<String> fullName = new ArrayList<>();
//		for (int i = 0; i < list.size(); i++) {
//			fullName.add(list.get(i).getFirstName() + " " + list.get(i).getLastName());
////		}
//		return fullName;

//}
