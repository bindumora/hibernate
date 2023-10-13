package controller;

import dao.SchoolDao;
import dto.School;
import dto.Students;

public class deleteStudents {

	public static void main(String[] args) {
SchoolDao school=new SchoolDao();
school.deleteStudents(1);

	}

}
