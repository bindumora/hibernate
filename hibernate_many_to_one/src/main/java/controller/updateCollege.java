package controller;

import dao.StudentDao;
import dto.College;
import dto.Student;

public class updateCollege {
	
	public static void main(String[] args) {
		College college=new College();
		college.setCollegeName("Prathibha");
		college.setCollegeAddress("sdpt");
		college.setCollegeFees(20000);
		
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		student1.setCollege(college);
		student2.setCollege(college);
		student3.setCollege(college);
		
		StudentDao studentDao=new StudentDao();
		studentDao.updateCollege(9, college);
		
	}
	}

