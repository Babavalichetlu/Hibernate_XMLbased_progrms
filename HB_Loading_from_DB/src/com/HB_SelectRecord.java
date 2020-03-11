package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HB_SelectRecord {

	public static void main(String[] args) {
		  Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml"); 
	 
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();
      // using load method
	        //Object o=session.load(Emp.class, new Integer(100));
	        Object o=session.get(Emp.class, new Integer(100));
	        Emp e=(Emp)o;
	            
	     // For loading Transaction scope is not necessary...
			System.out.println("Loaded object product name is-->"+e.getName());
			System.out.println("Loaded object product name is-->"+e.getDesc());

	    
	        System.out.println("Object loaded successfully.....!!");
	       // tx.commit();
	        session.close();
	        factory.close();
	    }
	 
	}



