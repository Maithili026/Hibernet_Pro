//Q.2)Create Car Entity class with different annotation.
package com.mypack1.HibernetCar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Car c = new Car();
        c.setCarId(234);
        c.setCarName("Toyota");
        c.setCarColour("Black");
        session.save(c);
        tx.commit();
    }
}
