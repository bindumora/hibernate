package controller;

import dao.StudentDao;
import dto.Student;

public class deleteCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentDao studentDao=new StudentDao();
studentDao.deleteCourse(1);
	}

}
