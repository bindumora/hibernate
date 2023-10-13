package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.College;
import dto.Student;

public class StudentDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("magician");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();



public void insertStudent(Student student)
{
	College college=student.getCollege();
	     entityTransaction.begin();
		entityManager.persist(student);
	    entityManager.persist(college);
        entityTransaction.commit();
}
public void fetchById(int id)
{
	Student dbstudent=entityManager.find(Student.class,id);
	if(dbstudent!=null)
	{
		System.out.println(dbstudent);
	}
}
public void fetchAll()
{
	Query query=entityManager.createQuery("select s from Student s");
	query.getResultList();
	System.out.println(query);
	
}
public void deleteStudent(int id)
{
	Student dbstudent=entityManager.find(Student.class, id);
	entityTransaction.begin();
	entityManager.remove(dbstudent);
	entityTransaction.commit();
	
}
public void deleteCollege(int id)
{
	College college=entityManager.find(College.class, id);
	entityTransaction.begin();
	entityManager.remove(college);
	entityTransaction.commit();
}
public void deleteBoth(int id)
{
	Student dbstudent=entityManager.find(Student.class, id);
	if(dbstudent!=null)
	{
		College college=dbstudent.getCollege();
		entityTransaction.begin();
		entityManager.remove(college);
		entityManager.remove(dbstudent);
		entityTransaction.commit();
	}
}
public void updateStudent(int id,Student student)

{
	Student dbstudent=entityManager.find(Student.class, id);
	if(dbstudent!=null)
	{
		student.setStudentId(id);
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
}
public void updateCollege(int id,College college)
{
	College dbcollege=entityManager.find(College.class, id);
	if(dbcollege!=null)
	{
		college.setCollegeId(id);
		entityTransaction.begin();
		entityManager.merge(college);
		entityTransaction.commit();
		
	}

}
public void updateBoth(int id, Student student)
{
	Student dbstudent=entityManager.find(Student.class, id);
	College college=student.getCollege();
	if(dbstudent!=null)
	
	{
		student.setStudentId(id);
		entityTransaction.begin();
		entityManager.merge(college);
		entityManager.merge(student);
		entityTransaction.commit();
	}
}
}
