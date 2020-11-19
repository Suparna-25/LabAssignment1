package com.cg.tca_attendance.repository;



import java.util.List;

import com.cg.tca_attendance.entities.AttendanceDetails;
import com.cg.tca_attendance.entities.Employees;

public interface IAttendanceDetailsRepository {
	public AttendanceDetails findAttendanceDetailsById(int attendanceId);
	public void addAttendanceDetails(AttendanceDetails attendance);
	//public  List<AttendanceDetails> findAttendanceDetailsByEmployeeId(long employeeId);
	public  void updateAttendanceStatus(AttendanceDetails attendance,String status);
	public void beginTransaction();
	public void commitTransaction();
		
	

}
