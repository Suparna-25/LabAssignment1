package com.cg.tca_attendance.repository;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import com.cg.tca_attendance.entities.AttendanceDetails;


public class AttendanceDetailsRepository implements IAttendanceDetailsRepository{
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	public AttendanceDetailsRepository() {
		entityManagerFactory = JPAUtil.getEntityManagerFactory();
		entityManager = entityManagerFactory.createEntityManager();
		
	}
	@Override
	public AttendanceDetails findAttendanceDetailsById(int attendance_Id) {
		AttendanceDetails entity = entityManager.find(AttendanceDetails.class,attendance_Id);
		AttendanceDetails attendance = new AttendanceDetails();
		attendance.setAttendanceId(entity.getAttendanceId());
		attendance.setIn_Time(entity.getIn_Time());
		attendance.setOut_Time(entity.getOut_Time());
		attendance.setDate(entity.getDate());
		attendance.setReason(entity.getReason());
		attendance.setType_Id(entity.getType_Id());
		attendance.setStatus(entity.getStatus());
		return attendance;

	}
	@Override
	public List<AttendanceDetails> findAttendanceDetailsByEmployeeId(long employee_Id) {
		AttendanceDetails entity = entityManager.find(AttendanceDetails.class,employee_Id);
		List<AttendanceDetails> attendance = new ArrayList<>();
		for(AttendanceDetails ad:attendance) {
		ad.setAttendanceId(entity.getAttendanceId());
		ad.setIn_Time(entity.getIn_Time());
		ad.setOut_Time(entity.getOut_Time());
		ad.setDate(entity.getDate());
		ad.setReason(entity.getReason());
		ad.setType_Id(entity.getType_Id());
		ad.setStatus(entity.getStatus());
		attendance.add(ad);
		}
		return attendance;

	}



	@Override
	public void addAttendanceDetails(AttendanceDetails attendance) {
		beginTransaction();
		AttendanceDetails entity = new AttendanceDetails();
		attendance.setAttendanceId(entity.getAttendanceId());
		attendance.setIn_Time(entity.getIn_Time());
		attendance.setOut_Time(entity.getOut_Time());
		attendance.setDate(entity.getDate());
		attendance.setReason(entity.getReason());
		attendance.setType_Id(entity.getType_Id());
		attendance.setStatus(entity.getStatus());
		entityManager.persist(entity);
		commitTransaction();
		
	}
	@Override
	public void updateAttendanceStatus(AttendanceDetails attendance,String status) {
		AttendanceDetails entity = entityManager.find(AttendanceDetails.class, attendance.getAttendanceId());
		if(entity.getStatus().equalsIgnoreCase("Pending")) {
			beginTransaction();
			entity.setStatus(status);
			commitTransaction();
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
