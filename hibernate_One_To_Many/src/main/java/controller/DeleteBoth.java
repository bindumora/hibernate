package controller;

import dao.SchoolDao;

public class DeleteBoth {
public static void main(String[] args) {
	SchoolDao schoolDao=new SchoolDao();
	schoolDao.deleteBoth(1);
}
}
