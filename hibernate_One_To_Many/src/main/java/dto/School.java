package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int schoolId;
private String schoolName;
private double schoolfees;
private String schoolAddress;
@OneToMany
private List<Students> students;
public int getSchoolId() {
	return schoolId;
}
public void setSchoolId(int schoolId) {
	this.schoolId = schoolId;
}
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}
public double getSchoolfees() {
	return schoolfees;
}
public void setSchoolfees(double schoolfees) {
	this.schoolfees = schoolfees;
}
public String getSchoolAddress() {
	return schoolAddress;
}
public void setSchoolAddress(String schoolAddress) {
	this.schoolAddress = schoolAddress;
}
public List<Students> getStudents() {
	return students;
}
public void setStudents(List<Students> students) {
	this.students = students;
}
@Override
public String toString() {
	return "School [schoolId=" + schoolId + ", schoolName=" + schoolName + ", schoolfees=" + schoolfees
			+ ", schoolAddress=" + schoolAddress + ", students=" + students + "]";
}

}
