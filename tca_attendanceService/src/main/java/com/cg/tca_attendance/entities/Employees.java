package com.cg.tca_attendance.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Employees {
	@Id
	private long emp_Id;
	private String emp_Name;
	private String phone_Number;
	private String emp_Email;
	private String emp_Location;
	private long supervisior_Id;
	@OneToMany(mappedBy="employee")
	private List<AttendanceDetails> attendance=new ArrayList<>();
	
	public long getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(Long emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}
	public String getEmp_Email() {
		return emp_Email;
	}
	public void setEmp_Email(String emp_Email) {
		this.emp_Email = emp_Email;
	}
	public String getEmp_Location() {
		return emp_Location;
	}
	public void setEmp_Location(String emp_Location) {
		this.emp_Location = emp_Location;
	}
	public List<AttendanceDetails> getAttendance() {
		return attendance;
	}
	public void setAttendance(List<AttendanceDetails> attendance) {
		this.attendance = attendance;
	}
	public long getSupervisior_Id() {
		return supervisior_Id;
	}
	public void setSupervisior_Id(long supervisior_Id) {
		this.supervisior_Id = supervisior_Id;
	}
	
	
}
