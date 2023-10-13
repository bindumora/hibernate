package controller;

import dao.PersonDao;

public class fetchById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PersonDao personDao=new PersonDao();
personDao.fetchById(4);
	}

}
