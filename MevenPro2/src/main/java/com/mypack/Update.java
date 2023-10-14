package com.mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee;
import com.Utility.HibernateUtil;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				SessionFactory factory=HibernateUtil.getSessionFactory();
				Session ses=HibernateUtil.getSession();
				
				try
				{
					ses.beginTransaction();
					Employee emp=ses.get(Employee.class,2);
					emp.se
					emp.setEmpDept("Admin");
				
					ses.getTransaction().commit();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
	}
}
				
