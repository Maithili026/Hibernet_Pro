package com.mypac.lib.HibernetLib2;

//import packages
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
       
        //create class object
      LibManagement l = new LibManagement();
      
      //set all fields with reference of object
      l.setMemId(11);
      l.setMemName("kartik");
      l.setMemType("Student");
      l.setbName("Hide");
      l.setAuthName("Nail Gray");
      
      //save object
        session.save(l);
        //commit transaction object
        tx.commit();
    }
}
