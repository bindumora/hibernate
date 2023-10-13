package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int companyId;
private String companyName;
private String companyGst;
private String companyAddress;
private long companyPhone;
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
public String getCompanyGst() {
	return companyGst;
}
public void setCompanyGst(String companyGst) {
	this.companyGst = companyGst;
}
public String getCompanyAddress() {
	return companyAddress;
}
public void setCompanyAddress(String companyAddress) {
	this.companyAddress = companyAddress;
}
public long getCompanyPhone() {
	return companyPhone;
}
public void setCompanyPhone(long companyPhone) {
	this.companyPhone = companyPhone;
}
@Override
public String toString() {
	return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyGst=" + companyGst
			+ ", companyAddress=" + companyAddress + ", companyPhone=" + companyPhone + "]";
}


}
