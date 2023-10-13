package controller;

import dao.UserDao;

public class FetchById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UserDao userDao=new UserDao();
userDao.fetchByid(1);
	}

}
