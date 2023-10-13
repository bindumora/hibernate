package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int employeeID;
private String employeeName;
private int employeeAge;
private double employeeSalary;
private String employeeAddress;
@ManyToOne
private Company company;
public int getEmployeeID() {
	return employeeID;
}
public void setEmployeeID(int employeeID) {
	this.employeeID = employeeID;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public int getEmployeeAge() {
	return employeeAge;
}
public void setEmployeeAge(int employeeAge) {
	this.employeeAge = employeeAge;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public String getEmployeeAddress() {
	return employeeAddress;
}
public void setEmployeeAddress(String employeeAddress) {
	this.employeeAddress = employeeAddress;
}
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}
@Override
public String toString() {
	return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
			+ ", employeeSalary=" + employeeSalary + ", employeeAddress=" + employeeAddress + ", company=" + company
			+ "]";
}

}
