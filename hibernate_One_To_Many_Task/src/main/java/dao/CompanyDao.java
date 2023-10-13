package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import dto.Company;
import dto.Employees;



public class CompanyDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("magician");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

public void insertCompany(Company company)
{
	
		List<Employees>list=company.getEmployees();
		entityTransaction.begin();
		for(Employees students:list) {
			entityManager.persist(students);
			
		}
		entityManager.persist(company);
		entityTransaction.commit();
	}
public void fetchById(int id)
{
	Company dbcompany=entityManager.find(Company.class, id);
	if(dbcompany!=null)
	{
	System.out.println(dbcompany);
}
}
public void fetchAll()
{
 javax.persistence.Query query=entityManager.createQuery("select c from Company c");
	List<Employees> employees=query.getResultList();
	System.out.println(employees);
}
public void deleteBoth(int id)
{
 Company query=	 entityManager.find(Company.class, id);
List<Employees> employees=query.getEmployees();
if(query!=null)
{
	entityTransaction.begin();
	List<Employees> list=query.getEmployees();
	for(Employees employees2:list)
	{
		entityManager.remove(employees2);
	}
	entityManager.remove(query);
entityTransaction.commit();	
}
}
public void updateBoth(int id, Company company)

{
	Company q1=entityManager.find(Company.class, id);
//	List<Employees> employees2=q1.getEmployees();
	if(q1!=null)
	{
	 q1.setCompanyId(id);
	 entityTransaction.begin();
	 List<Employees> list=q1.getEmployees();
	 for(Employees employees3:list)
	 {
	 entityManager.merge(employees3);
	 
	}
	 entityManager.merge(company);
	 entityTransaction.commit();

}
else
{
	 System.out.println("id not found");
}
}

}