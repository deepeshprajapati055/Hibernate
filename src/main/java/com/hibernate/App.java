package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello Deepesh Prajapati from Hibernate." );
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
    	
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        //Creating student class object.
        Student st = new Student();
        st.setId(101);
        st.setName("Rahul Prajapati");
        st.setAge(31);
        st.setCity("Pune");
        System.out.println(st);
        
        //Getting current session through factory and it will return currently running session.
        Session session = factory.openSession();
        
        //The session will start the transaction and store it in the tx variable.
        Transaction tx = session.beginTransaction();
        
        //At the time of transaction it will save st object.
        session.save(st);
        
        //commit the transaction.
        tx.commit();
        
        //close the session.
        session.close();
    
    }
}
