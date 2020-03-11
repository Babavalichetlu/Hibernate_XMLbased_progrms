package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HB_Delete_Record {

	public static void main(String[] args) {
		  Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml"); 
	 
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();

	        Object o=session.load(Emp.class,new Integer(101));
	        Emp p=(Emp)o;
	        

	        Transaction tx = session.beginTransaction();
	        session.delete(p);    
	        
	        
	    
	        System.out.println("Record Deleted successfully.....!!");
	        tx.commit();
	        session.close();
	        factory.close();
	    }
	 
	}



