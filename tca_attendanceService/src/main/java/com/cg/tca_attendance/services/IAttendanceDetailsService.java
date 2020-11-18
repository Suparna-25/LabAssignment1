package com.cg.tca_attendance.services;

import java.util.List;

import com.cg.tca_attendance.entities.AttendanceDetails;

public interface IAttendanceDetailsService {
	public void addAttendanceDetails(AttendanceDetails attendance);
	public  void updateAttendanceStatus(AttendanceDetails attendance,String status);
	public List<AttendanceDetails> viewAttendanceDetailsByEmployeeId(long employee_Id);
	public String setAttendanceType(String type,int choice);
	
}
