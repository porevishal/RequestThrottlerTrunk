package com.vishal.persistence.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.vishal.persistence.data.Email;

public class EmailDao extends Dao {

	public void saveEmail(Email email) {
		try {
			beginTransation();
			getSession().save(email);
			commit();
		} catch (HibernateException hibernateException) {
			rollback();
			System.out.println("Unable to save email " + hibernateException);

		}
	}

	public Email findEmailById(int id) {
		Email email = null;
		try {
			beginTransation();
			Query query = getSession().createQuery("from Email where id = :id");
			query.setInteger("id", id);
			email = (Email) query.uniqueResult();
			commit();
		} catch (HibernateException hibernateException) {
			rollback();
			System.out.println("Unable to retrive email" + hibernateException);
		}
		return email;
	}

	@SuppressWarnings("unchecked")
	public List<Email> findEmailsBySubject(String subject) {

		List<Email> emailList = null;
		try {
			beginTransation();
			Query query = getSession().createQuery(
					"from Email where subject = :subject");
			query.setString("subject", subject);
			emailList = query.list();
			commit();

		} catch (HibernateException hibernateException) {
			rollback();
			System.out
					.println("Could not retieve emails " + hibernateException);
		}

		return emailList;
	}
}
