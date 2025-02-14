package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Student student = (Student)session.get(Student.class, 101);
		System.out.println(student.getName()+" : "+student.getAge()+" : "+student.getCity());
		
		Student student1 = (Student)session.get(Student.class, 101);
		System.out.println(student1.getName()+" : "+student1.getAge()+" : "+student1.getCity());
		
		Address address = (Address)session.load(Address.class, 2);
		System.out.println(address.getCity()+" : "+address.getStreet());
		
	}
}
