package controller;

import java.util.ArrayList;
import java.util.List;

import dao.CompanyDao;
import dto.Company;
import dto.Employee;

public class insertBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Employee employee1=new Employee();
   employee1.setEmployeeName("bindu");
   employee1.setEmployeeAddress("hyd");
   
   
   Employee employee2=new Employee();
   employee2.setEmployeeName("pavani");
   employee2.setEmployeeAddress("banglore");
   
   Employee employee3=new Employee();
   employee3.setEmployeeName("akhila");
   employee3.setEmployeeAddress("chaitanyapuri");
   
   
   Employee employee4=new Employee();
   employee4.setEmployeeName("tulasi");
   employee4.setEmployeeAddress("hyd");
   
   
   Company company=new Company();
   company.setCompanyName("wipro");
   company.setCompanyAddress("hyd");
   
   
   List<Employee>list=new ArrayList<Employee>();
   list.add(employee1);
   list.add(employee2);
   list.add(employee3);
   list.add(employee4);
   
   company.setEmployees(list);
   employee1.setCompany(company);
   employee2.setCompany(company);
   employee3.setCompany(company);
   employee4.setCompany(company);
   
   
   CompanyDao companyDao=new CompanyDao();
   companyDao.insertBoth(company);
   
   
	}

}
