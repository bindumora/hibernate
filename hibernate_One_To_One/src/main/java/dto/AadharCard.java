package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AadharCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int aadharId;
private long aadharNumber;
private String aadharAuthority;
public int getAadharId() {
	return aadharId;
}
public void setAadharId(int aadharId) {
	this.aadharId = aadharId;
}
public long getAadharNumber() {
	return aadharNumber;
}
public void setAadharNumber(long aadharNumber) {
	this.aadharNumber = aadharNumber;
}
public String getAadharAuthority() {
	return aadharAuthority;
}
public void setAadharAuthority(String aadharAuthority) {
	this.aadharAuthority = aadharAuthority;
}
@Override
public String toString() {
	return "AadharCard [aadharId=" + aadharId + ", aadharNumber=" + aadharNumber + ", aadharAuthority="
			+ aadharAuthority + "]";
}

}
