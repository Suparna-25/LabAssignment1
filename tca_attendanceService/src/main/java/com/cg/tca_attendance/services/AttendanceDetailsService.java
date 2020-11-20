package com.cg.tca_attendance.services;
import com.cg.tca_attendance.repository.AttendanceDetailsRepository;
import com.cg.tca_attendance.entities.AttendanceDetails;

public class AttendanceDetailsService implements IAttendanceDetailsService{
	private AttendanceDetailsRepository rep;
	public AttendanceDetailsService() {
		rep=new AttendanceDetailsRepository();
	}
	@Override
	public void addAttendanceDetails(AttendanceDetails attendance) {
		rep.addAttendanceDetails(attendance);
		
	}

	@Override
	public void updateAttendanceStatus(AttendanceDetails attendance, String status) {
		rep.updateAttendanceStatus(attendance, status);
		
	}


	@Override
	public void setAttendanceType(int choice,AttendanceDetails attendance) {
		switch(choice) {
		case 1: attendance.setTypeId("Forgot Card");
		break;
		case 2: attendance.setTypeId("Client Location");
		break;
		case 3: attendance.setTypeId("Working From Home");
		break;
		case 4: attendance.setTypeId("Business Travel");
		break;
		default:attendance.setTypeId("Missed Both Swipes");
		
		}
	}
	

}
