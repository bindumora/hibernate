package controller;

import dao.StudentDao;

public class deleteCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentDao studentDao=new StudentDao();
studentDao.deleteCollege(2);
	}

}
