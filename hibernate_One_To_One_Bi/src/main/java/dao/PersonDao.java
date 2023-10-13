package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.PanCard;
import dto.Person;


public class PersonDao {

	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("magician");
	EntityManager  entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	
	
	public void saveBoth(Person person)

	{  
//		PanCard panCard=person.getPancard();
		entityTransaction.begin();
//		entityManager.persist(panCard);
		entityManager.persist(person);
		entityTransaction.commit();
	}
	public void fetchById(int id)
	{
		Person person=entityManager.find(Person.class, id);
		System.out.println(person);
	}
	public void fetchAll()
	{
	  Query query=entityManager.createQuery("select p from Person p");
	  List<Person> list=query.getResultList();
	  System.out.println(list);
		
	}
	public void fetchByName(String name)
	{
		Query query=entityManager.createQuery("select p from Person p where p.personName=?1 ");
        query.setParameter(1, name);
		List<Person> list=query.getResultList();
	System.out.println(list); 
	}
	public void deleteBoth(int id)
	{
		Person dbperson=entityManager.find(Person.class, id);
		if(dbperson!=null)
		{
			entityTransaction.begin();
			entityManager.remove(dbperson);
		
			entityTransaction.commit();
		}
	}
	public void updateBoth(int id,Person person)
	{
		Person dbPerson=entityManager.find(Person.class,id);
		if(dbPerson!=null)
		{
			person.setPersonId(id);
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
		}
	}
}
