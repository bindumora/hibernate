package controller;

import dao.CompanyDao;

public class FetchAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CompanyDao companyDao=new CompanyDao();
companyDao.fetchByAll();
	}

}
