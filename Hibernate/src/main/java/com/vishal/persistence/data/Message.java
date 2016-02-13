package com.vishal.persistence.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="message",nullable=false,length=25,unique=false)
	private String message;
	
	public Message() {
	}
	
	public Message(String message) {
		this.message=message;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
