package com.ty.many.to.many.bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCabPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Cab cab1=new Cab();
		cab1.setDriverName("ashok");
		cab1.setCost(1000);
		
		Cab cab2=new Cab();
		cab2.setDriverName("chiru");
		cab2.setCost(500);
		
		List<Cab> cabs1=new ArrayList<Cab>();
		cabs1.add(cab1);
		cabs1.add(cab2);
		
		List<Cab> cabs2=new ArrayList<Cab>();
		cabs2.add(cab1);
		
		Person person1=new Person();
		person1.setName("prashant");
		person1.setEmail("prashu@123");
		person1.setAge(26);
		
		Person person2=new Person();
		person2.setName("raju");
		person2.setEmail("raju@123");
		person2.setAge(24);
		
		Person person3=new Person();
		person3.setName("anand");
		person3.setEmail("anand@123");
		person3.setAge(25);
		
		List<Person> persons1=new ArrayList<Person>();
		persons1.add(person1);
		persons1.add(person2);
		
		List<Person> persons2=new ArrayList<Person>();
		persons2.add(person1);
		persons2.add(person3);
		
		cab1.setPerson(persons1);
		cab2.setPerson(persons2);
		
		persons1.setCab(cabs1);
		
		
		
		

}
