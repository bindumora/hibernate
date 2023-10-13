package controller;

import java.util.ArrayList;
import java.util.List;

import dao.SchoolDao;
import dto.School;
import dto.Students;

public class SaveMain {
public static void main(String[] args) {
	School school=new School();
	school.setSchoolName("chaiatanya");
	school.setSchoolfees(20000);
	school.setSchoolAddress("kmm");
	
	Students students1=new Students();
	students1.setStudentName("raju");
	students1.setStudentAge(6);
	students1.setStudentDOB("2017");
	students1.setStudentAdderess("mdp");
	
	Students students2=new Students();
	students2.setStudentName("rani");
	students2.setStudentAge(5);
	students2.setStudentDOB("2018");
	students2.setStudentAdderess("hyd");
	
	
	Students students3=new Students();
	students3.setStudentName("roja");
	students3.setStudentAge(4);
	students3.setStudentDOB("2019");
	students3.setStudentAdderess("kodad");
	
	
	List<Students>list=new ArrayList<Students>();
	list.add(students1);
	list.add(students2);
	list.add(students3);
	
	school.setStudents(list);
	SchoolDao schoolDao=new SchoolDao();
	schoolDao.saveSchool(school);
	
			
}
}
