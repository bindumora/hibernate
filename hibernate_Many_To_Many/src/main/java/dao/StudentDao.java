package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import dto.Course;
import dto.Student;

public class StudentDao {
 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sharath");
 EntityManager entityManager=entityManagerFactory.createEntityManager();
 EntityTransaction entityTransaction=entityManager.getTransaction();
 
 
 
 
public void saveBoth(Student student)
{
	entityTransaction.begin();
	List<Course> list=student.getCourse();
	for(Course course:list)
	{
		entityManager.persist(course);
	}
	entityManager.persist(student);
	entityTransaction.commit();
	
}
public void fetchById(int id)
{
	Student dbstudent=entityManager.find(Student.class, id);
	if(dbstudent!=null)
	{
		System.out.println(dbstudent);
	}
	
}
public void fetchAll()
{
	javax.persistence.Query query=entityManager.createQuery("select s from Student s");
	query.getResultList();
	System.out.println(query);
	
}
public void fetchByName(String name,int yop)
{
	javax.persistence.Query query=entityManager.createQuery("select s from Student s where s.studentName=?1 and s.studentYOP=?2");
	query.setParameter(1, name);
	query.setParameter(2,yop);
List<Student> list=query.getResultList();
System.out.println(list);
	
}
public void deleteStudent(int id )
{
	Student dbstudent=entityManager.find(Student.class, id);
	if(dbstudent!=null)
	{
		entityTransaction.begin();
		entityManager.remove(dbstudent);
		entityTransaction.commit();
	}
}
public void deleteCourse(int id)
{
	Course dbcourse=entityManager.find(Course.class, id);
	if(dbcourse!=null)
	{
		entityTransaction.begin();
		entityManager.remove(dbcourse);
		entityTransaction.commit();
	}
}
public void deleteBoth(int id)
{
	Student dbstudent=entityManager.find(Student.class, id);
	if(dbstudent!=null)
	{ 
		List<Course> course=dbstudent.getCourse();
		entityTransaction.begin();
		entityManager.remove(dbstudent);
		entityManager.remove(course);
		entityTransaction.commit();
	}
	
}
public void updateStudent(int id, Student student)
{
	Student dbstudent=entityManager.find(Student.class, id);
	if(dbstudent!=null)
	{
		student.setStudentId(id);
		student.setCourse(dbstudent.getCourse());
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
}
public void updateCourse(int id,Course course)
{
	Course dbcourse=entityManager.find(Course.class, id);
	if(dbcourse!=null)
	{
		course.setCourseId(id);
	entityTransaction.begin();
	entityManager.merge(course);
	entityTransaction.commit();
	}
}
public void updateBoth(int id,Student student)
{
	Student dbstudent=entityManager.find(Student.class, id);
List<Course> list=student.getCourse();
	if(dbstudent!=null)
	{
	student.setStudentId(id);
	entityTransaction.begin();
	entityManager.merge(student);
	for(Course course:list) {
		
	entityManager.merge(course);
    
	
	}
	entityTransaction.commit();
}
 }
}
