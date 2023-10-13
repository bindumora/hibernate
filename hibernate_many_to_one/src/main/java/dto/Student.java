package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int studentId;
private String studentName;
private int studentAge;
private String studentAddress;
@ManyToOne
private College college;

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public int getStudentAge() {
	return studentAge;
}

public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}

public String getStudentAddress() {
	return studentAddress;
}

public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}

public College getCollege() {
	return college;
}

public void setCollege(College college) {
	this.college = college;
}

@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
			+ ", studentAddress=" + studentAddress + ", college=" + college + "]";
}

}
