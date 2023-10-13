package controller;

import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import dto.Course;
import dto.Student;

public class insertBoth {

	public static void main(String[] args) {
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
		 student1.setStudentQualification("BE");
		 student1.setStudentAddress("banglore");
		 student1.setStudentYOP(2022);
		 student1.setCourse(list1);
		 
		 Student student2=new Student();
		 student2.setStudentName("dhoni");
		 student2.setStudentQualification("BSC");
		 student2.setStudentAddress("chennai");
		 student2.setStudentYOP(2021);
		 student2.setCourse(list2);
		 
		 
		 Student student3=new Student();
		 student3.setStudentName("rohit");
		 student3.setStudentQualification("BTECH");
		 student3.setStudentAddress("mumbai");
		 student3.setStudentYOP(2020);
		 student3.setCourse(list3);
		 
		 
		 StudentDao studentDao=new StudentDao();
		 studentDao.saveBoth(student1);
		 studentDao.saveBoth(student2);
		 studentDao.saveBoth(student3);
		 
		 
		 
		 
		 
		
		 
		 
		 
		 
		 
	}

}
