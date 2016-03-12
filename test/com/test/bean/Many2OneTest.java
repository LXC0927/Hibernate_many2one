package com.test.bean;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.HibernateSessionFactory;

public class Many2OneTest {

	private Session session;
	private Transaction transaction;
	@Before
	public void setUp() throws Exception {
		session = HibernateSessionFactory.getSession();
		transaction = session.beginTransaction();
	}

	@After
	public void tearDown() throws Exception {
		HibernateSessionFactory.closeSession();
	}

	@Test
	public void test() {
		Student student = (Student) session.get(Student.class, 1);
		System.out.println(student.getSname());
		System.out.println(student.getClass1().getCname());
	}

}
