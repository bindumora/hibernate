package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int employeeId;
private String employeeName;
private double employeSalary;
private int employeeAge;
private String employeeAddress;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getEmployeSalary() {
	return employeSalary;
}
public void setEmployeSalary(double employeSalary) {
	this.employeSalary = employeSalary;
}
public int getEmployeeAge() {
	return employeeAge;
}
public void setEmployeeAge(int employeeAge) {
	this.employeeAge = employeeAge;
}
public String getEmployeeAddress() {
	return employeeAddress;
}
public void setEmployeeAddress(String employeeAddress) {
	this.employeeAddress = employeeAddress;
}
@Override
public String toString() {
	return "Employees [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeSalary=" + employeSalary
			+ ", employeeAge=" + employeeAge + ", employeeAddress=" + employeeAddress + "]";
}

}
