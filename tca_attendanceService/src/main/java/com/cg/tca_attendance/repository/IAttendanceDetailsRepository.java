package com.cg.tca_attendance.repository;



import java.util.List;

import com.cg.tca_attendance.entities.AttendanceDetails;

public interface IAttendanceDetailsRepository {
	public AttendanceDetails findAttendanceDetailsById(int attendance_Id);
	public void addAttendanceDetails(AttendanceDetails attendance);
	public  List<AttendanceDetails> findAttendanceDetailsByEmployeeId(long employee_Id);
	public  void updateAttendanceStatus(AttendanceDetails attendance,String status);
	public void beginTransaction();
	public void commitTransaction();
		
	

}
