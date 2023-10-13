package controller;

import dao.StudentDao;

public class FetchById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentDao studentDao=new StudentDao();
studentDao.fetchById(1);
	}

}
