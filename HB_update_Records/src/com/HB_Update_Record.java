package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HB_Update_Record {

	public static void main(String[] args) {
		  Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml"); 
	 
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();
	        
             // Approach 1 Load the record with id and change any one of the value in it.. Do not change the id
	        Object o=session.load(Emp.class,new Integer(102));
	        Transaction tx = session.beginTransaction();
	        Emp e=(Emp)o;
	      /*  e.setId(101);
	        e.setName("Sabira");
	        e.setDesc("NW");
	        The above approach is working becoz we loaded the nrecord with id and again we are not able to change the id
	       */
	        e.setDesc("NW");
	        
	        
	     
	        tx.commit();
	        System.out.println("Object Updated successfully.....!!");
	        session.close();
	        factory.close();
	        
	    /* // Approach 2
	        Emp p=new Emp();
	        e.setId(106);  // This Record must be in DB
	        e.setName("Sabira");
	        e.setDesc("NW");
	      Transaction tx = session.beginTransaction();
			session.update(p);// we are calling update method here
		tx.commit();*/
	        
	        
	    }
	 
	}



