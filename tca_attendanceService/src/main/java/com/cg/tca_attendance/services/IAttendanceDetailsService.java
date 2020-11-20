package com.cg.tca_attendance.services;

import com.cg.tca_attendance.entities.AttendanceDetails;
/**
 * This Interface holds the structure for AttendanceDetailsService class
 * @author Suparna Arya
 *
 */

public interface IAttendanceDetailsService {
	/**
	 * This method is used to add attendance details
	 * @param attendance
	 */
	public void addAttendanceDetails(AttendanceDetails attendance);
    /**
     * This method is used to update AttendanceDetails status from pending to approve/reject
     * @param attendance
     * @param status
     */
	public void updateAttendanceStatus(AttendanceDetails attendance, String status);
	/**
	 * This method is used to set the attendanceType according to the user's choice
	 * @param choice
	 * @param attendance
	 */
	public void setAttendanceType(int choice, AttendanceDetails attendance);

}
