package com.cg.tca_attendance.repository;


import com.cg.tca_attendance.entities.AttendanceDetails;
/**
 * This Interface holds the structure of AttendanceDetails Repository
 * @author Suparna Arya
 *
 */
public interface IAttendanceDetailsRepository {
	/**
	 * This method find AttendanceDetails using attendaceId 
	 * @param attendanceId
	 * @return AttendanceDetails object
	 */
	public AttendanceDetails findAttendanceDetailsById(int attendanceId);
	/**
	 * This method save/add/persists attendanceDetails object in database
	 * @param attendance
	 */
	public void addAttendanceDetails(AttendanceDetails attendance);
	/**
	 * This method update the attendance status from pending to approve/reject
	 * @param attendance
	 * @param status
	 */

	public void updateAttendanceStatus(AttendanceDetails attendance, String status);
    /**
     * This method begin transaction in database
     */
	public void beginTransaction();
	/**
     * This method commit transaction in database
     */
	public void commitTransaction();

}
