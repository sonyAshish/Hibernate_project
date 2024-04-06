package com.aks;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aks.model.UserDetails;

public class App {
	
	public static void main(String[] args) {
		System.out.println("hello ! hibernate");
		
		UserDetails  userDetails = new UserDetails();
		userDetails.setUserId(1);
		userDetails.setUerName("ashu");
		
		
		
		Configuration config = new Configuration();
		config.configure("/com/aks/hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		System.out.println(sessionFactory);
		
	}

}
