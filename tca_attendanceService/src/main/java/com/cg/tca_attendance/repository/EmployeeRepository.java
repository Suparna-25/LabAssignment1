package com.cg.tca_attendance.repository;

import com.cg.tca_attendance.entities.AttendanceDetails;
import com.cg.tca_attendance.entities.Employees;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;


public class EmployeeRepository implements IEmployeeRepository {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public  EmployeeRepository() {
		entityManagerFactory = JPAUtil.getEntityManagerFactory();
		entityManager = entityManagerFactory.createEntityManager();
		
		
	}

	@Override
	public Employees findEmployeeById(long emp_Id) {
		Employees entity = entityManager.find(Employees.class,emp_Id);
		Employees employee = new Employees();
		employee.setEmp_Id(entity.getEmp_Id());
		employee.setEmp_Name(entity.getEmp_Name());
		employee.setPhone_Number(entity.getPhone_Number());
		employee.setEmp_Email(entity.getEmp_Email());
		employee.setAttendance(entity.getAttendance());
		employee.setSupervisior_Id(entity.getSupervisior_Id());

		return employee;
	}

	@Override
	public void addEmployee(Employees employee) {
		beginTransaction();
		Employees entity = new Employees();
		employee.setEmp_Id(entity.getEmp_Id());
		employee.setEmp_Name(entity.getEmp_Name());
		employee.setPhone_Number(entity.getPhone_Number());
		employee.setEmp_Email(entity.getEmp_Email());
		employee.setAttendance(entity.getAttendance());
		employee.setSupervisior_Id(entity.getEmp_Id());
				
		entityManager.persist(entity);
		commitTransaction();
		
	}
	@Override
	public List<Employees> findEmployeesUnderSupervisior(long supervisiorId) {
		
		TypedQuery<Employees> query  = entityManager.createQuery(
	          "SELECT * FROM Employees WHERE superisior_Id=supervisorId", Employees.class);
		List<Employees> resultList = query.getResultList();
		return resultList;
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
