package com.cg.tca_attendance.repository;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


import com.cg.tca_attendance.entities.AttendanceDetails;
import com.cg.tca_attendance.entities.Employees;


public class AttendanceDetailsRepository implements IAttendanceDetailsRepository{
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	public AttendanceDetailsRepository() {
		entityManagerFactory = JPAUtil.getEntityManagerFactory();
		entityManager = entityManagerFactory.createEntityManager();
		
	}
	@Override
	public AttendanceDetails findAttendanceDetailsById(int attendanceId) {
		AttendanceDetails entity = entityManager.find(AttendanceDetails.class,attendanceId);

		return entity;

	}
//	@Override
//	public List<AttendanceDetails> findAttendanceDetailsByEmployeeId(long employeeId) {
//		List<AttendanceDetails> attendance = new ArrayList<>();
//		
//		 lon entity= entityManager.find(AttendanceDetails.class,a.getEmployee().getEmpId());
//		   a.add(entity);
//		}
//		      
//		return attendance;
//
//	}



	@Override
	public void addAttendanceDetails(AttendanceDetails attendance) {
		entityManager.getTransaction().begin();
		entityManager.persist(attendance);
		entityManager.getTransaction().commit();
		//entityManager.close();
		
	}
	@Override
	public void updateAttendanceStatus(AttendanceDetails attendance,String status) {
		AttendanceDetails entity = entityManager.find(AttendanceDetails.class, attendance.getAttendanceId());
		if(entity.getStatus().equalsIgnoreCase("Pending")) {
			entityManager.getTransaction().begin();
			entity.setStatus(status);
			entityManager.getTransaction().commit();
		//	entityManager.close();
		}
	}
	
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}
		

}
