package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Course;
import dto.Student;

public class StudentDao {
 
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("magician");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	
	
	public void insertBoth(List<Student> student)
	{
		entityTransaction.begin();
		for(Student student1:student)
		{
		List<Course> list=student1.getCourse();
		for(Course course:list)
		{
			entityManager.persist(course);
		}
		entityManager.persist(student1);
		
	}
		entityTransaction.commit();
		
}
}