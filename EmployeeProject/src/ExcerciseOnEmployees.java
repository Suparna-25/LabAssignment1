
//import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExcerciseOnEmployees {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("pankaj", "sharma", 40000),
				new Employee("aman", "sony", 20000), new Employee("suman", "arya", 50000),
				new Employee("anuj", "rathore", 50000));
		System.out.println(sortBasedOnFirstName(employees));
		System.out.println(displayEmployeeNmaeStartsWitha(employees));
	}

	public static List<Employee> sortBasedOnFirstName(List<Employee> employees) {
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e1.getFname().compareTo(e2.getFname());
			}

		});
		return employees;
	}

	public static List<Employee> displayEmployeeNmaeStartsWitha(List<Employee> employees) {
		List<Employee> emp = new ArrayList<>();

		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getFname().startsWith("a")) {
				emp.add(employees.get(i));
			}
		}
		return emp;
	}

}
