package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int courseId;
private String courseName;
private double courseFees;
private int courseDuration;
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public double getCourseFees() {
	return courseFees;
}
public void setCourseFees(double courseFees) {
	this.courseFees = courseFees;
}
public int getCourseDuration() {
	return courseDuration;
}
public void setCourseDuration(int courseDuration) {
	this.courseDuration = courseDuration;
}
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFees=" + courseFees
			+ ", courseDuration=" + courseDuration + "]";
}

}
