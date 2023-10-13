package controller;

import dao.StudentDao;
import dto.College;
import dto.Student;

public class updateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Student student1=new Student();
			student1.setStudentName("jaanu");
			student1.setStudentAge(32);
			student1.setStudentAddress("warangal");
			
			Student student2=new Student();
			student2.setStudentName("anuu");
			student2.setStudentAge(32);
			student2.setStudentAddress("warangal");
			
			Student student3=new Student();
			student3.setStudentName("manu");
			student3.setStudentAge(32);
			student3.setStudentAddress("warangal");
			
			College college=new College();
			college.setCollegeId(6);
			
			StudentDao studentDao=new StudentDao();
			studentDao.updateStudent(6, student1);
			studentDao.updateStudent(7, student2);
			studentDao.updateStudent(8, student3);
			
		


	}

}
