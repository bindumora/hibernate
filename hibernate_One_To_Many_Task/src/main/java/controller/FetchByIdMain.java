package controller;

import dao.CompanyDao;

public class FetchByIdMain {

	public static void main(String[] args) {
		CompanyDao companyDao=new CompanyDao();
		companyDao.fetchById(1);
	}

}
