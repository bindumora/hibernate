package controller;

import dao.StudentDao;
import dto.Student;

public class updateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student student=new Student();
		 student.setStudentName("jadeja");
		 student.setStudentQualification("BE");
		 student.setStudentAddress("banglore");
		 student.setStudentYOP(2022);
		 
		 StudentDao studentDao=new StudentDao();
		 studentDao.updateStudent(1, student);
	}

}
