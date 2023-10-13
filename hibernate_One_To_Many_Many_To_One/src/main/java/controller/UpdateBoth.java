package controller;

import java.util.ArrayList;
import java.util.List;

import dao.CompanyDao;
import dto.Company;
import dto.Employee;

public class UpdateBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1=new Employee();
		   employee1.setEmployeeName("kiran");
		   employee1.setEmployeeAddress("hyd");
		   employee1.setEmployeeId(1);
		   
		   
		   Employee employee2=new Employee();
		   employee2.setEmployeeName("thirumal");
		   employee2.setEmployeeAddress("banglore");
		   employee2.setEmployeeId(2);
		   
		   Employee employee3=new Employee();
		   employee3.setEmployeeName("abhi");
		   employee3.setEmployeeAddress("chaitanyapuri");
		   employee3.setEmployeeId(3);
		   
		   
		   
		   Company company=new Company();
		   company.setCompanyName("tcs");
		   company.setCompanyAddress("hyd");
		   company.setCompanyId(1);
		   
		   
		   List<Employee>list=new ArrayList<Employee>();
		   list.add(employee1);
		   list.add(employee2);
		   list.add(employee3);
		   
		   
		   company.setEmployees(list);
		   employee1.setCompany(company);
		   employee2.setCompany(company);
		   employee3.setCompany(company);
		 
		   
		   
		   CompanyDao companyDao=new CompanyDao();
		   companyDao.updateBoth(1, employee1);
		   companyDao.updateBoth(2, employee2);
		   companyDao.updateBoth(3, employee3);
		   
		   
		   
			}

	

	}


