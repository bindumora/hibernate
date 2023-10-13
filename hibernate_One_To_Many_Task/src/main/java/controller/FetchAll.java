package controller;

import dao.CompanyDao;

public class FetchAll {
public static void main(String[] args) {
	CompanyDao companyDao=new CompanyDao();
	companyDao.fetchAll();
}
}
