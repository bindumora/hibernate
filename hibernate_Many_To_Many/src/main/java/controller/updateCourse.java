package controller;

import dao.StudentDao;
import dto.Course;

public class updateCourse {

	public static void main(String[] args) {
		Course course=new Course();
		 course.setCourseName("TESTING");
		 course.setCourseFees(38000);
		 course.setCourseDuration(6);
		 
		 
		 
		 StudentDao studentDao=new StudentDao();
		 studentDao.updateCourse(1, course);
	}

}
