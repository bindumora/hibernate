package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int collegeId;
private String collegeName;
private String collegeAddress;
private double collegeFees;
public int getCollegeId() {
	return collegeId;
}
public void setCollegeId(int collegeId) {
	this.collegeId = collegeId;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getCollegeAddress() {
	return collegeAddress;
}
public void setCollegeAddress(String collegeAddress) {
	this.collegeAddress = collegeAddress;
}
public double getCollegeFees() {
	return collegeFees;
}
public void setCollegeFees(double collegeFees) {
	this.collegeFees = collegeFees;
}
@Override
public String toString() {
	return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeAddress=" + collegeAddress
			+ ", collegeFees=" + collegeFees + "]";
}

}
