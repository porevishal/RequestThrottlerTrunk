package com.vishal.persistence.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Dao implements IDao {

	private static final ThreadLocal<Session> session = new ThreadLocal<Session>();
	private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	
	@Override
	public void commit() {
		
		getSession().beginTransaction().commit();
	}

	@Override
	public void rollback() {
		getSession().beginTransaction().rollback();
		Dao.session.set(null);
	}

	@Override
	public void beginTransation() {
		getSession().beginTransaction().begin();
	}
	
	public static Session getSession() {
		Session session = (Session) Dao.session.get();
		
		if( session == null) {
			System.out.println("New Session created ");
			session = sessionFactory.openSession();
			Dao.session.set(session);
		}
		
		return session;
	}

}
