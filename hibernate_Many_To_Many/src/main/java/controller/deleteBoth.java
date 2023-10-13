package controller;

import dao.StudentDao;
import dto.Student;

public class deleteBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentDao studentDao=new StudentDao();
studentDao.deleteBoth(3);
	}

}
