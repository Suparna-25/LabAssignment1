package com.cg.tca_attendance.services;

import java.util.List;

import com.cg.tca_attendance.entities.AttendanceDetails;
import com.cg.tca_attendance.entities.Employees;

public interface IAttendanceDetailsService {
	public void addAttendanceDetails(AttendanceDetails attendance);
	public  void updateAttendanceStatus(AttendanceDetails attendance,String status);
	//public List<AttendanceDetails> viewAttendanceDetailsByEmployeeId(Employees employee);
	public void setAttendanceType(int choice,AttendanceDetails attendance);
	
}
