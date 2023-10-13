package controller;

import dao.SchoolDao;

public class FetchByIdMain {

	public static void main(String[] args) {
		SchoolDao schoolDao=new SchoolDao();
				schoolDao.fetchById(1);
	}

}
