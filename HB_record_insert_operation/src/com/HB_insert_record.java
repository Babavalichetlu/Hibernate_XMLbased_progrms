package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HB_insert_record {

	public static void main(String[] args) {
		  Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml"); 
	 
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();

	        Emp e=new Emp();
	        e.setId(100);
	        e.setName("Babavali");
	        e.setDesc("SE");        
	        
	        Transaction tx = session.beginTransaction();
	        session.save(e);
	    
	        System.out.println("Record saved successfully.....!!");
	        tx.commit();
	        session.close();
	        factory.close();
	    }
	 
	}



