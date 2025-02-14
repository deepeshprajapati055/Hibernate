package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddingClasses {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		Student std = new Student();
		std.setId(191);
		std.setName("Deepesh Prajapati");
		std.setAge(24);
		std.setCity("Gwalior");

		Certificate cer = new Certificate();
		cer.setCourses("Java");
		cer.setDuration("6 months");
		cer.setTaughtBy("By Rahul Prajapati");
		std.setCertificate(cer);
		
		Student std1 = new Student();
		std1.setId(221);
		std1.setName("Rahul Prajapati");
		std1.setAge(31);
		std1.setCity("Pune");

		Certificate cer1 = new Certificate();
		cer1.setCourses("Python");
		cer1.setDuration("6 months");
		cer1.setTaughtBy("By Deepesh Prajapati");
		std1.setCertificate(cer1);
		
		Transaction tx = session.beginTransaction();
		
		session.save(std);
		session.save(std1);
		
		tx.commit();
		session.close();
	}
}
