package controller;

import dao.SchoolDao;

public class deleteSchool {
public static void main(String[] args) {
	SchoolDao schoolDao=new SchoolDao();
	schoolDao.deleteSchool(2);
}
}
