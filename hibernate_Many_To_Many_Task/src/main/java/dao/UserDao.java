package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Application;
import dto.Users;

public class UserDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("magician");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	
	
	public void insertBoth(Users users)
	{
		List<Application> list=users.getApplication();
		entityTransaction.begin();
		for(Application application:list)
		{
		entityManager.persist(application);
		
	}
		entityManager.persist(users);
		entityTransaction.commit();
}
	public void fetchByid(int id)
	{
		Users dbusers=entityManager.find(Users.class, id);
		if(dbusers!=null)
		{
			System.out.println(dbusers);
		}
	}
	public void fetchAll()
	{
		Query query=entityManager.createQuery("select u from Users u");
		query.getResultList();
		System.out.println(query);
		}
	public void deleteBoth(int id)
	{
		Users users=entityManager.find(Users.class,id);
		if(users!=null) {
			entityTransaction.begin();
			entityManager.remove(users);
			entityTransaction.commit();
		}
	}
	public void updateBoth(int id,Users users)
	{
		Users dbusers=entityManager.find(Users.class, id);
		List<Application>list=users.getApplication();
		if(dbusers!=null)
		{
			users.setUserId(id);
			entityTransaction.begin();
		    entityManager.merge(users);
		    for(Application application:list)
		    {
		    	entityManager.merge(application);
		    }
			entityTransaction.commit();
		}
	}
}
