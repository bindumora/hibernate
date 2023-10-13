package controller;

import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import dto.College;
import dto.Student;

public class insertStudent {

	public static void main(String[] args) {
				
				Student student1=new Student();
				student1.setStudentName("chotu");
				student1.setStudentAge(22);
				student1.setStudentAddress("siddipet");
				
				Student student2=new Student();
				student2.setStudentName("shiva");
				student2.setStudentAge(19);
				student2.setStudentAddress("warangal");
				
				Student student3=new Student();
				student3.setStudentName("kalyana");
				student3.setStudentAge(30);
				student3.setStudentAddress("medak");
				
				 List<Student> list=new ArrayList<Student>();
				 list.add(student1);
				 list.add(student2);
				 list.add(student3);
				

				 
				College college=new College();
				college.setCollegeName("guru nanak");
				college.setCollegeFees(50000);
				college.setCollegeAddress("Basar");
			
				student1.setCollege(college);
				student2.setCollege(college);
				student3.setCollege(college);
				
				StudentDao studentDao=new StudentDao();
				studentDao.insertStudent(student1);
				studentDao.insertStudent(student2);
				studentDao.insertStudent(student3);

			}

		

}
