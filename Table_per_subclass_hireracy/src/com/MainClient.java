package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClient {

	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml"); 
	 
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();
        SWEmployee sw=new SWEmployee(100,"baba",1000.0,"HB");
        SWEmployee sw1=new SWEmployee(101,"raja",4000.0,"spring");
        SWEmployee sw2=new SWEmployee(102,"rani",8000.0,"struts");
        
        HWEmployee hw=new HWEmployee(200,"ravi",1000.0,8);
        HWEmployee hw1=new HWEmployee(201,"ravisankar",1000.0,9);
     
        Admin admin=new Admin(301,"raviraja",8000.0,"DZ");
        Admin admin1=new Admin(302,"ravndra",9000.0,"Dx");
       /* admin.setId(300);
        admin.setName("babaAhmadi");
        admin.setSal(4800);
        admin.setDept("DZ");*/
        Transaction tx = session.beginTransaction();
        session.save(sw);
        session.save(sw1);
        session.save(sw2);        
        session.save(hw);
        session.save(hw1);
        session.save(admin);
        session.save(admin1);
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        factory.close();
        
        
        
        
        

	}

}
