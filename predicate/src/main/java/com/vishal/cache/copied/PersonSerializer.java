package com.vishal.cache.copied;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonSerializer {
	
	String prefix = "";
	
	public void serialize(String key, Person person){
		 try
		 {
			 FileOutputStream fos = new FileOutputStream(prefix+key);
			 ObjectOutputStream out = new ObjectOutputStream(fos);
			 out.writeObject(person);
			 out.close();
		 }
		 catch(IOException ex){}
	}
	
	public Person deserialize(String key){
		Person person = null;
		try{
			FileInputStream fis = new FileInputStream(prefix+key);
			ObjectInputStream in = new ObjectInputStream(fis);
			person = (Person)in.readObject();
			in.close();
		}
		catch(IOException ex){}
		catch(ClassNotFoundException ex){}
		return person;
	}
	
}
