package com.vishal.persistence;

import com.vishal.persistence.dao.EmailDao;
import com.vishal.persistence.dao.MessageDao;
import com.vishal.persistence.data.Email;
import com.vishal.persistence.data.Message;

public class EmailService {
	
	private EmailDao emailDao;
	private MessageDao mssgDao;

	public static void main(String[] args) {

		Message mssg = new Message("First Email, First Message");
		Email email = new Email("First Email", mssg);
		
	}


	public void setEmailDao(EmailDao emailDao) {
		this.emailDao = emailDao;
	}

	public void setMssgDao(MessageDao mssgDao) {
		this.mssgDao = mssgDao;
	}

}
