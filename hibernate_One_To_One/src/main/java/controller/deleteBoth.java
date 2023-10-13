package controller;

import dao.personDao;
import dto.Person;

public class deleteBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
personDao personDao=new personDao();
personDao.deleteBoth(1);
	}

}
