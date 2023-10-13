package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int companyId;
private String companyName;
private String companyAddress;
private String Gst;
@OneToMany
List<Employees> employees;

public int getCompanyId() {
	return companyId;
}
public void setCompanyId(int companyId) {
	this.companyId = companyId;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getCompanyAddress() {
	return companyAddress;
}
public void setCompanyAddress(String companyAddress) {
	this.companyAddress = companyAddress;
}
public String getGst() {
	return Gst;
}
public void setGst(String gst) {
	Gst = gst;
}
public List<Employees> getEmployees() {
	return employees;
}
public void setEmployees(List<Employees> employees) {
	this.employees = employees;
}
@Override
public String toString() {
	return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyAddress=" + companyAddress
			+ ", Gst=" + Gst + ", employees=" + employees + "]";
}

}
