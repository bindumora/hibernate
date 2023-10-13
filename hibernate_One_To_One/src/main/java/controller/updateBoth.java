package controller;

import dao.personDao;
import dto.AadharCard;
import dto.Person;

public class updateBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		  person.setPersonName("kranthi");
		  person.setPersonAddress("cmr");
		  person.setPersonPhone(9876453219l);
		  person.setPersonAge(21);
		  
		  AadharCard aadharCard=new AadharCard();
		  aadharCard.setAadharNumber(3588900876l);
		  aadharCard.setAadharAuthority("goi");
		  
		   person.setAadharCard(aadharCard);
		  personDao personDao=new personDao();
		  personDao.updateBoth(1, person);
		  
		  
	}

}
