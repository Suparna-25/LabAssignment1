package com.cg.tca_attendance.services;
import com.cg.tca_attendance.repository.AttendanceDetailsRepository;

import java.util.ArrayList;
import java.util.List;

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
	public List<AttendanceDetails> viewAttendanceDetailsByEmployeeId(long employee_Id) {
		List<AttendanceDetails> attendance=rep.findAttendanceDetailsByEmployeeId(employee_Id);
		return attendance;
	}

	@Override
	public String setAttendanceType(String type, int choice) {
		AttendanceDetails attendance=new AttendanceDetails();
		switch(choice) {
		case 1: attendance.setType_Id("Forgot Card");
		break;
		case 2: attendance.setType_Id("Client Location");
		break;
		case 3: attendance.setType_Id("Working From Home");
		break;
		case 4: attendance.setType_Id("Business Travel");
		break;
		default:attendance.setType_Id("Missed Both Swipes");
		}
		return null;
	}
	

}
