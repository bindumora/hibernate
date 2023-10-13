package controller;

import dao.StudentDao;
import dto.Student;

public class fetchByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentDao studentDao=new StudentDao();
studentDao.fetchByName("jadeja", 2022);
	}

}
