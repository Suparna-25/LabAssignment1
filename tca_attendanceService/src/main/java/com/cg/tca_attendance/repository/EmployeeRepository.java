package com.cg.tca_attendance.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.cg.tca_attendance.entities.Employees;
/**
 * This java class access attendance details from database implementing IEmployeeRepository
 * @author Suparna Arya
 *
 */

public class EmployeeRepository implements IEmployeeRepository {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	//EntityManagerFactory is created and it's object is passed to EntityManager
	public EmployeeRepository() {
		entityManagerFactory = JPAUtil.getEntityManagerFactory();
		entityManager = entityManagerFactory.createEntityManager();

	}
	 //This method find employees details using empId and returns Employees Object
	@Override
	public Employees findEmployeeById(long empId) {
		entityManager.getTransaction().begin();
		Employees entity = entityManager.find(Employees.class, empId);
		entityManager.getTransaction().commit();

		return entity;
	}
 
	//This method is passing Employees Object to persist or add in database
	@Override
	public void addEmployee(Employees employee) {
		entityManager.getTransaction().begin();

		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		// entityManager.close();

	}
    /**
     * This method use native query to find employees working under Supervisor using supervisiorId
     */
	@Override
	public List<Employees> findEmployeesUnderSupervisior(long Id) {
       //This native query maps all the Employee working under supervisor using supervisor id
		Query q = entityManager.createNativeQuery("SELECT a.* FROM Employees a where a.supervisiorId = ? ",
				Employees.class);
		q.setParameter(1, Long.valueOf(Id));
		List<Employees> employees = q.getResultList();

		return employees;
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
