package controller;

import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import dto.Application;
import dto.Users;

public class insertBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
 
 Application application1=new Application();
 application1.setApplicationName("school_application");
 application1.setApplicationCost(20);
 
 
 Application application2=new Application();
 application2.setApplicationName("voter_application");
 application2.setApplicationCost(30); 
 
 
 
 List<Application> list1=new ArrayList<Application>();
 list1.add(application1);
 list1.add(application2);
 
 
 
 List<Application> list2=new ArrayList<Application>();
 list2.add(application1);
 
 
 
 Users users1=new Users();
 users1.setUserName("vasavi");
 users1.setUserAddress("uppal");
 users1.setApplication(list1);
 
 Users users2=new Users();
 users2.setUserName("vani");
 users2.setUserAddress("mdp");
 users2.setApplication(list2);
 
 
 UserDao userDao=new UserDao();
 userDao.insertBoth(users1);
userDao.insertBoth(users2); 
 
 
 
	}

}
