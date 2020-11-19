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
	private String inTime;
	private String outTime;
	private String date;
	private String reason;
	private String typeId;
	private String status;
	@ManyToOne
	@JoinColumn(name="empId")
	private Employees employee;
	public int getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
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
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
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
	@Override
	public String toString() {
		return "AttendanceDetails [attendanceId=" + attendanceId + ", inTime=" + inTime + ", outTime=" + outTime
				+ ", date=" + date + ", reason=" + reason + ", typeId=" + typeId + ", status=" + status + ", employee="
				+ employee + "]";
	}
}
