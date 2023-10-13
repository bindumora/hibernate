package controller;

import java.util.ArrayList;
import java.util.List;

import dao.EmployeeDao;
import dto.Company;
import dto.Employee;

public class insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee employee1=new Employee();
employee1.setEmployeeName("bindu");
employee1.setEmployeeAddress("hyderabad");
employee1.setEmployeeAge(21);
employee1.setEmployeeSalary(25000);



Employee employee2=new Employee();
employee2.setEmployeeName("hima");
employee2.setEmployeeAddress("kmm");
employee2.setEmployeeAge(24);
employee2.setEmployeeSalary(45000);


Employee employee3=new Employee();
employee3.setEmployeeName("pavani");
employee3.setEmployeeAddress("chaitanyapuri");
employee3.setEmployeeAge(23);
employee3.setEmployeeSalary(29000);


Company company=new Company();
company.setCompanyName("infosys");
company.setCompanyAddress("mumbai");
company.setCompanyGst("2AAFB");
company.setCompanyPhone(97261234560l);



List<Employee>list=new ArrayList<Employee>();
list.add(employee1);
list.add(employee2);
list.add(employee3);


employee1.setCompany(company);
employee2.setCompany(company);
employee3.setCompany(company);


EmployeeDao employeeDao=new EmployeeDao();
employeeDao.insert(employee1);
employeeDao.insert(employee2);
employeeDao.insert(employee3);
	}

}
