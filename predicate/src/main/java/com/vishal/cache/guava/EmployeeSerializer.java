package com.vishal.cache.guava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerializer {
	
	public static void serialize(String key, Employee employee) throws IOException {
		
		FileOutputStream outputStream = new FileOutputStream(key);
		ObjectOutputStream oStream = new ObjectOutputStream(outputStream);
		oStream.writeObject(employee);
		oStream.close();
		outputStream.close();
	}
	
	public static Employee deSerialize(String key) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(key);
		ObjectInputStream oInputStream = new ObjectInputStream(fis);
		Employee employee = (Employee) oInputStream.readObject();
		oInputStream.close();
		fis.close();
		
		return employee;
		
		
	}

}
