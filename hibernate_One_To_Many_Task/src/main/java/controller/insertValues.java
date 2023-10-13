package controller;

import java.util.ArrayList;
import java.util.List;

import dao.CompanyDao;
import dto.Company;
import dto.Employees;

public class insertValues {
public static void main(String[] args) {
	Company company=new Company();
	company.setCompanyName("infosys");
	company.setCompanyAddress("Hyd");
	company.setGst("22AAA");
	
Employees employee1=new Employees();
employee1.setEmployeeName("bindu");
employee1.setEmployeeAge(21);
employee1.setEmployeeAddress("hyd");
employee1.setEmployeSalary(200000);
	
	
Employees employee2=new Employees();
employee2.setEmployeeName("hima");
employee2.setEmployeeAge(22);
employee2.setEmployeeAddress("banglore");
employee2.setEmployeSalary(280000);
	
//	
//Employees employee3=new Employees();
//employee3.setEmployeeName("rani");
//employee3.setEmployeeAge(31);
//employee3.setEmployeeAddress("mumbai");
//employee3.setEmployeSalary(10000);
//
//
//Employees employee4=new Employees();
//employee4.setEmployeeName("kiran");
//employee4.setEmployeeAge(22);
//employee4.setEmployeeAddress("hyd");
//employee4.setEmployeSalary(200000);
//
//
//Employees employee5=new Employees();
//employee5.setEmployeeName("kranthi");
//employee5.setEmployeeAge(26);
//employee5.setEmployeeAddress("kmm");
//employee5.setEmployeSalary(200000);
//	
	List<Employees>employees=new ArrayList<Employees>();
	employees.add(employee1);
	employees.add(employee2);
//	employees.add(employee3);
//	employees.add(employee4);
//	employees.add(employee5);
	
	
	company.setEmployees(employees);
	CompanyDao companyDao=new CompanyDao();
	companyDao.insertCompany(company);
	

   
	
	 
}
}
