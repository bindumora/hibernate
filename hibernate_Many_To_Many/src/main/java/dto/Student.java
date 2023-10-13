package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int studentId;
private String studentName;
private String studentQualification;
private int studentYOP;
private String studentAddress;
@ManyToMany
List<Course> course;
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
public String getStudentQualification() {
	return studentQualification;
}
public void setStudentQualification(String studentQualification) {
	this.studentQualification = studentQualification;
}
public int getStudentYOP() {
	return studentYOP;
}
public void setStudentYOP(int studentYOP) {
	this.studentYOP = studentYOP;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
public List<Course> getCourse() {
	return course;
}
public void setCourse(List<Course> course) {
	this.course = course;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentQualification="
			+ studentQualification + ", studentYOP=" + studentYOP + ", studentAddress=" + studentAddress + ", course="
			+ course + "]";
}

}


