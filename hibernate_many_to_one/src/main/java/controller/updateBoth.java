package controller;

import dao.StudentDao;
import dto.College;
import dto.Student;

public class updateBoth {
	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.setStudentId(6);
		student1.setStudentName("c");
		student1.setStudentAge(22);
		student1.setStudentAddress("siddipet");
		
		Student student2=new Student();
		student2.setStudentId(7);
		student2.setStudentName("b");
		student2.setStudentAge(19);
		student2.setStudentAddress("warangal");
		
		Student student3=new Student();
		student3.setStudentId(8);
		student3.setStudentName("a");
		student3.setStudentAge(30);
		student3.setStudentAddress("medak");

		 
		College college=new College();
		//college.setCollegeId(6);
		college.setCollegeName("nit");
		college.setCollegeFees(50000);
		college.setCollegeAddress("warangal");

		student1.setCollege(college);
		student2.setCollege(college);
		student3.setCollege(college);
		
		StudentDao studentDao=new StudentDao();
		studentDao.updateBoth(10, student1);
		studentDao.updateBoth(11, student2);
		studentDao.updateBoth(12, student3);
		
		
		//	studentDao.updateBoth(6, student3);
		//	studentDao.updateBoth(7, student3);
		//	studentDao.updateBoth(8, student3);
	}
		
		
	
}
