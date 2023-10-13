package controller;

import dao.personDao;

public class FetchPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
personDao personDao=new personDao();
personDao.fetchPerson(2);
	}

}
