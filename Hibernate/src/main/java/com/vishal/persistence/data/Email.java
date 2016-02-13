package com.vishal.persistence.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Email {
	
	private int id;
	private String subject;
	private Message message;
	
	public Email() {
	}
	
	public Email(String subject, Message message) {
		this.subject = subject;
		this.message = message;
	}
	
	public Email(String subject) {
		this.subject = subject;
	}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "subject")
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@OneToOne
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	

}
