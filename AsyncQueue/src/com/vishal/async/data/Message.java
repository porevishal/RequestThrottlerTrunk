package com.vishal.async.data;

public class Message implements IMessage {

	public Message(String messageString) {
		super();
		this.messageString = messageString;
	}

	private String messageString;

	@Override
	public void printMessage() {

		System.out.println("Message is " + messageString);
	}

	public String getMessageString() {
		return messageString;
	}

	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return messageString;
	}

}
