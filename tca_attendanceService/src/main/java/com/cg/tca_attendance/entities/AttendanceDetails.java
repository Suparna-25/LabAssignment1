package com.cg.tca_attendance.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class AttendanceDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int attendanceId;
	private String in_Time;
	private String out_Time;
	private String date;
	private String reason;
	private String type_Id;
	private String status;
	@ManyToOne
	@JoinColumn(name="emp_Id")
	private Employees employee;
	public int getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}
	public String getIn_Time() {
		return in_Time;
	}
	public void setIn_Time(String in_Time) {
		this.in_Time = in_Time;
	}
	public String getOut_Time() {
		return out_Time;
	}
	public void setOut_Time(String out_Time) {
		this.out_Time = out_Time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getType_Id() {
		return type_Id;
	}
	public void setType_Id(String type_Id) {
		this.type_Id = type_Id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setEmployee(Employees employee)
	{
		this.employee=employee;
	}
	public Employees getEmployee()
	{
		return employee;
	}

}
