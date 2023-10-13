package controller;

import dao.EmployeeDao;
import dto.Employee;

public class FetchById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeDao employeeDao=new EmployeeDao();
employeeDao.fetchById(1);
	}

}
