package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Company;
import dto.Employee;



public class EmployeeDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("magician");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();



public void insert(Employee employee)
{

     Company company=employee.getCompany();
		     entityTransaction.begin();
			entityManager.persist(employee);
		    entityManager.persist(company);
	        entityTransaction.commit();
	}
public void fetchById(int id)
{
	Employee dbEmployee=entityManager.find(Employee.class, id);
	System.out.println(dbEmployee);
}
public void fetchAll()
{
	Query query=entityManager.createQuery("selete e from Employee e");
	query.getResultList();
	System.out.println(query);
}

public void deleteBoth(int id)
{
	Employee dbEmployee=entityManager.find(Employee.class, id);
	if(dbEmployee!=null)
	{
	Company company=dbEmployee.getCompany();
		entityTransaction.begin();
		entityManager.remove(company);
		entityManager.remove(dbEmployee);
		entityTransaction.commit();
	}
}

}
