package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Company;
import dto.Employee;


public class CompanyDao {

	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("magician");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public void insertBoth(Company company)
	{
		List<Employee>list=company.getEmployees();
		entityTransaction.begin();
		for(Employee employee:list) {
			entityManager.persist(employee);
			
	}
		entityManager.persist(company);
		entityTransaction.commit();

	}
	public void fetchById(int id)
	{
	Employee dbemployee=entityManager.find(Employee.class, id);
			if(dbemployee!=null)
			{
				System.out.println(dbemployee);
			}
		
	}
	public void fetchByAll()
	{
		Query query=entityManager.createQuery("select e from Employee e");
		List<Employee> list=query.getResultList();
		System.out.println(list);
	}
	public void updateBoth(int id,Employee employee)
	{
		Employee dbEmployee=entityManager.find(Employee.class, id);
		if(dbEmployee!=null)
		{
			employee.setEmployeeId(id);
			entityTransaction.begin();
			entityManager.merge(dbEmployee);
			entityTransaction.commit();
		}
	}
	public void deleteBoth(int id)
	{
		Employee dbEmployee=entityManager.find(Employee.class, id);
		if(dbEmployee!=null)
		{
			entityTransaction.begin();
			entityManager.remove(dbEmployee);
			entityTransaction.commit();
		}
		
	}
}
