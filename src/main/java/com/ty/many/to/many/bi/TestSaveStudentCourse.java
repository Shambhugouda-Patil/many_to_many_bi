package com.ty.many.to.many.bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.many.to.many.bi.Course;
import com.ty.many.to.many.bi.Student;

public class TestSaveStudentCourse {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Course course1=new Course();
		course1.setName("java");
		course1.setDuration("6 month");
		
		Course course2=new Course();
		course2.setName("python");
		course2.setDuration("3 month");
		
		Course course3=new Course();
		course3.setName("devops");
		course3.setDuration("2 month");
		
		List<Course> list1=new ArrayList<Course>();
		list1.add(course1);
		list1.add(course2);
		list1.add(course3);
		
		List<Course> list2=new ArrayList<Course>();
		list2.add(course1);
		list2.add(course2);
		
		Student student1=new Student();
		student1.setAge(30);
		student1.setName("vinod");
		
		student1.setCourses(list1);
		
		Student student2=new Student();
		student2.setAge(32);
		student2.setName("vikas");
		
		student2.setCourses(list2);
	
		List<Student> students1=new ArrayList<Student>();
		students1.add(student1);
		
		List<Student> students2=new ArrayList<Student>();
		students2.add(student2);

		
		
		
		
		entityTransaction.begin();
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityTransaction.commit();
	}

}
