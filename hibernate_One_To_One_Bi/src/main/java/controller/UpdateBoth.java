package controller;

import dao.PersonDao;
import dto.PanCard;
import dto.Person;

public class UpdateBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		 person.setPersonName("jadeja");
		 person.setPersonAge(22);
		 
		 
		 
		 PanCard panCard=new PanCard();
		 panCard.setPancardId(4);
		 panCard.setPancardNumber("ghua2789");
		 panCard.setPancardauthority("gok");
		 
		 
		 panCard.setPeron(person);
		 person.setPancard(panCard);
		 
		 PersonDao personDao=new PersonDao();
		 personDao.updateBoth(4, person);
	}

}
