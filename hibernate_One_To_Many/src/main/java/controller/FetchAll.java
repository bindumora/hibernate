package controller;

import dao.SchoolDao;

public class FetchAll {
public static void main(String[] args) {
	SchoolDao schooldao =new SchoolDao();
	schooldao.fetchAll();
}
}
