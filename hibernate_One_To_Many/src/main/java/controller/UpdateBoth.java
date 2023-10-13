package controller;

import java.util.ArrayList;
import java.util.List;

import dao.SchoolDao;
import dto.School;
import dto.Students;

public class UpdateBoth {
public static void main(String[] args) {
	School school=new School();
	school.setSchoolName("chaitanya");
	school.setSchoolfees(14000);
	school.setSchoolAddress("hyd");
	
	Students students1=new Students();
	students1.setStudentId(1);
	students1.setStudentName("gopi");
	students1.setStudentAge(5);
	students1.setStudentDOB("2017");
	students1.setStudentAdderess("hyd");
	
	Students students2=new Students();
	students2.setStudentId(2);
	students2.setStudentName("gagan");
	students2.setStudentAge(5);
	students2.setStudentDOB("2018");
	students2.setStudentAdderess("hyd");
	
	
	Students students3=new Students();
	students3.setStudentId(3);
	students3.setStudentName("geetha");
	students3.setStudentAge(4);
	students3.setStudentDOB("2019");
	students3.setStudentAdderess("hyd");
	
	
	List<Students>list=new ArrayList<Students>();
	list.add(students1);
	list.add(students2);
	list.add(students3);
	
	school.setStudents(list);
	SchoolDao schoolDao=new SchoolDao();
	schoolDao.updateBoth(1, school);
	
			


}
}
