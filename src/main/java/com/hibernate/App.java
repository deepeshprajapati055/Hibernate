package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        //System.out.println( "Hello Deepesh Prajapati from Hibernate." );
        //System.out.println(factory);
        //System.out.println(factory.isClosed());
    	
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        //Creating Object for Student Class.
        Student st = new Student();
        st.setId(104);
        st.setName("Jyoti Prajapati");
        st.setAge(31);
        st.setCity("Pune");
        System.out.println(st);
        
        //Creating Object for Address Class.
        Address ad = new Address();
        ad.setStreet("Street3");
        ad.setCity("Gwalior3");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.45); 
        
        //Reading image
        FileInputStream fis = new FileInputStream("src/main/java/profile.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        System.out.println(fis);
        
        //Getting current session through factory and it will return currently running session.
        Session session = factory.openSession();
        
        //The session will start the transaction and store it in the tx variable.
        Transaction tx = session.beginTransaction();
        
        //At the time of transaction it will save st object.
        session.save(st);
        
        //save address class object.
        session.save(ad);
        
        //commit the transaction.
        tx.commit();
        
        //close the session.
        session.close();
    
    }
}
