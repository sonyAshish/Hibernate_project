package com.aks;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		System.out.println("hello ! hibernate");
		Configuration config = new Configuration();
		config.configure("/com/aks/hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		System.out.println(sessionFactory);
		
	}

}
