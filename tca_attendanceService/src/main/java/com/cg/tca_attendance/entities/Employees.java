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
	
	private long empId;
	private String empName;
	private String phoneNumber;
	private String empEmail;
	private String empLocation;
	private long supervisiorId;
	@OneToMany(mappedBy="employee")
	private List<AttendanceDetails> attendance=new ArrayList<>();
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String emp_Name) {
		this.empName = emp_Name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public List<AttendanceDetails> getAttendance() {
		return attendance;
	}
	public void setAttendance(List<AttendanceDetails> attendance) {
		this.attendance = attendance;
	}
	public long getSupervisiorId() {
		return supervisiorId;
	}
	public void setSupervisiorId(long supervisiorId) {
		this.supervisiorId = supervisiorId;
	}
//	@Override
//	public String toString() {
//		return "Employees [empId=" + empId + ", empName=" + empName + ", phoneNumber=" + phoneNumber + ", empEmail="
//				+ empEmail + ", empLocation=" + empLocation + ", supervisiorId=" + supervisiorId + ", attendance="
//				+ attendance + "]";
//	}
	
	
}
