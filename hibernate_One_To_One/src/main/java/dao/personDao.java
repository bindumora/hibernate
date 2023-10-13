 package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.AadharCard;
import dto.Person;

public class personDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("magician");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();


public void insertPerson(Person person) {
	AadharCard aadharcard=person.getAadharCard();
	entityTransaction.begin();
	entityManager.persist(aadharcard);
	entityManager.persist(person);
	entityTransaction.commit();
	
}
public void fetchPerson(int id)
{
	Person person=entityManager.find(Person.class, id);
	System.out.println(person);
}
public void fetchByAll()
{
	Query query=entityManager.createQuery("select p from Person p");
	List<Person> list=query.getResultList();
	System.out.println(list);
	
}
public void deletePerson(int id)
{
	Person  dbperson=entityManager.find(Person.class,id);
	if(dbperson!=null)
	{
		entityTransaction.begin();
		entityManager.remove(dbperson);
		entityTransaction.commit();
		
	}
	else
	{
		System.out.println("id not found");
	}
	
}
public void deleteBoth(int id)
{
	Person person=entityManager.find(Person.class, id);
	if(person!=null)
	{
		entityTransaction.begin();
		entityManager.remove(person);
	
		entityTransaction.commit();
	}
	else
	{
		System.out.println("id  not found");
	}
}
public void updateBoth(int id,Person person)
{
	Person dbperson=entityManager.find(Person.class,id);
//	AadharCard aadharcard=person.getAadharCard();
	if(dbperson!=null)
	{
		person.setPersonId(id);
//		aadharcard.setAadharId(id);
		  
		entityTransaction.begin();
//		entityManager.merge(aadharcard);
		entityManager.merge(person);
		entityTransaction.commit();
	}
	else
	{
		
		System.out.println("id not found");
	}
			
}

}

