package com.cg.tca_attendance.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.cg.tca_attendance.entities.AttendanceDetails;
/**
 * This java class access attendance details from database by implementing the IAttendanceDetailsRepository
 * @author Suparna Arya
 *
 */
public class AttendanceDetailsRepository implements IAttendanceDetailsRepository {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
  
	//EntityManagerFactory is created and it's object is passed to EntityManager
	public AttendanceDetailsRepository() {
		entityManagerFactory = JPAUtil.getEntityManagerFactory();
		entityManager = entityManagerFactory.createEntityManager();

	}
    //This method find attendance details using attendanceId and returns AttendanceDetails Object
	@Override
	public AttendanceDetails findAttendanceDetailsById(int attendanceId) {
		AttendanceDetails entity = entityManager.find(AttendanceDetails.class, attendanceId);

		return entity;

	}

	//This method is passing AttendanceDetails Object to persist or add in database
	@Override
	public void addAttendanceDetails(AttendanceDetails attendance) {
		entityManager.getTransaction().begin();
		entityManager.persist(attendance);
		entityManager.getTransaction().commit();
		

	}
     //This method will update AttendanceDetails status to either Approve/Reject if it is Pending
	@Override
	public void updateAttendanceStatus(AttendanceDetails attendance, String status) {
		attendance = entityManager.find(AttendanceDetails.class, attendance.getAttendanceId());
		if (attendance.getStatus().equalsIgnoreCase("Pending")) {
			entityManager.getTransaction().begin();
			attendance.setStatus(status);
			entityManager.getTransaction().commit();

		}
	}
   //This method is used to begin Transaction
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();

	}
	//This method is used to commit Transaction
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();

	}

}
