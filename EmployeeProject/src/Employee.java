
public class Employee {
	private String fname;
	private String lname;
	private int salary;

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", salary=" + salary + "]";
	}

	public Employee(String fname, String lname, int salary) {
		this.setFname(fname);
		this.setLname(lname);
		this.setSalary(salary);
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
