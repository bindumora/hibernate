package controller;

import dao.personDao;
import dto.AadharCard;
import dto.Person;

public class insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Person person=new Person();
  person.setPersonName("kiran");
  person.setPersonAddress("kmm");
  person.setPersonPhone(9876453219l);
  person.setPersonAge(21);
  
  AadharCard aadharCard=new AadharCard();
  aadharCard.setAadharNumber(345678900876l);
  aadharCard.setAadharAuthority("goi");
  
   person.setAadharCard(aadharCard);
  personDao personDao=new personDao();
  personDao.insertPerson(person);
  
  
  
	}

}
