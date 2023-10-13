package controller;

import dao.PersonDao;
import dto.PanCard;
import dto.Person;

public class insertMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Person person=new Person();
 person.setPersonName("virat");
 person.setPersonAge(22);
 
 
 
 PanCard panCard=new PanCard();
 panCard.setPancardNumber("hab008789");
 panCard.setPancardauthority("goi");
 
 
 panCard.setPeron(person);
 person.setPancard(panCard);
 
 PersonDao personDao=new PersonDao();
 personDao.saveBoth(person);
	}

}
