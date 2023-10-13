package controller;

import dao.StudentDao;

public class deleteStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentDao studentDao=new StudentDao();
studentDao.deleteStudent(2);
	}

}
