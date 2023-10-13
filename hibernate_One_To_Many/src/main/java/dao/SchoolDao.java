package dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.School;
import dto.Students;

public class SchoolDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("magician");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();


public void saveSchool(School school)

{
	List<Students>list=school.getStudents();
	entityTransaction.begin();
	for(Students students:list) {
		entityManager.persist(students);
		
	}
	entityManager.persist(school);
	entityTransaction.commit();
}

public void fetchById(int id)
{
	School dbschool=entityManager.find(School.class, id);
	System.out.println(dbschool);
}
public void fetchAll()
{
	Query query=entityManager.createNamedQuery("select s from School s");
	List<School> list=query.getResultList();
	System.out.println(list);
}
public void deleteSchool( int id)
{
	School dbSchool=entityManager.find(School.class,id);
	if(dbSchool!=null)
	{
		entityTransaction.begin();
		entityManager.remove(dbSchool);
		entityTransaction.commit();
	}
	else {
		System.out.println("id not found");
	}
}
public void deleteStudents(int id)
{
	Students students=entityManager.find(Students.class, id);
	if(students!=null)
	{
		entityTransaction.begin();
		entityManager.remove(students);
		entityTransaction.commit();
	}
	else
	{
		
		System.out.println("id not found");
	}
			}
public void deleteBoth(int id)

{
	School dbcSchool=entityManager.find(School.class,id);
	if(dbcSchool!=null)
	{
		entityTransaction.begin();
		List<Students> list=dbcSchool.getStudents();
		for(Students students:list)
		{
			entityManager.remove(students);
		}
		entityManager.remove(dbcSchool);
		entityTransaction.commit();
		
	}
	else
	{
		System.out.println("id not found");
	}
}
	public void  updateBoth(int id ,School school)
	{
	 School dbschool=entityManager.find(School.class, id);
	 if(dbschool!=null)
	 {
		school.setSchoolId(id);
		entityTransaction.begin();
		List<Students>list=school.getStudents();
		for(Students students:list)
		{
			entityManager.merge(students);
		}
entityManager.merge(school);

		entityTransaction.commit();
			 
	}
	 else
	 {
		 System.out.println("id not found");
	 }
}


}

