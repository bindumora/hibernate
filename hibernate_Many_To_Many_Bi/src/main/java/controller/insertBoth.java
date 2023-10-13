package controller;

import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import dto.Course;
import dto.Student;

public class insertBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1=new Course();
		 course1.setCourseName("JAVA");
		 course1.setCourseFees(38000);
		 course1.setCourseDuration(6);
		 
		 
		 
		 
		 Course course2=new Course();
		 course2.setCourseName("PYTHON");
		 course2.setCourseFees(28000);
		 course2.setCourseDuration(4);
		 
		 
		 
		 Course course3=new Course();
		 course3.setCourseName("SQL");
		 course3.setCourseFees(15000);
		 course3.setCourseDuration(1);
	
		 
		 
		 List<Course> list1=new ArrayList<Course>();
		 list1.add(course1);
		 list1.add(course2);
		 
		 
		 List<Course>list2=new ArrayList<Course>();
		 list2.add(course1);
		 list2.add(course3);
		 
		 
		 List<Course>list3=new ArrayList<Course>();
		 list3.add(course3);
		 
		 
		 Student student1=new Student();
		 student1.setStudentName("virat");
		 student1.setStudentAge(21);
	     student1.setCourse(list1);
		 
		 Student student2=new Student();
		 student2.setStudentName("dhoni");
		 student2.setStudentAge(23);
		 student2.setCourse(list2);
		 
		 
		 Student student3=new Student();
		 student3.setStudentName("rohit");
		student3.setStudentAge(25);
		 student3.setCourse(list3);
		 

		 
		 List<Student> group1=new ArrayList<Student>();
		 group1.add(student1);
		 group1.add(student2);
		 
		 List<Student> group2=new ArrayList<Student>();
		 group2.add(student1);
		 group2.add(student3);
		 
		 
		 List<Student> group3=new ArrayList<Student>();
		 group3.add(student3);
		 
		 
		 student1.setCourse(list1);
		 student2.setCourse(list2);
		 student3.setCourse(list3);
		 
		 course1.setStudent(group1);
		 course2.setStudent(group2);
		 course3.setStudent(group3);
		 
		 
		 
		 StudentDao studentDao=new StudentDao();
		 studentDao.insertBoth(group1);
		 studentDao.insertBoth(group2);
		 studentDao.insertBoth(group3);
		 
	 
		 
		
		 
		 
		 
		 
		
	}

}
