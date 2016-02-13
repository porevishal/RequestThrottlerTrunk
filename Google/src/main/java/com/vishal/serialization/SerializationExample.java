package com.vishal.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		try {
			Employee yahoo = EmployeeFactory.getInstance("Yahoo", 20);
			Employee google = EmployeeFactory.getInstance("Google", 19);

			Employee overageEmployee = EmployeeFactory.getInstance(
					"older and wiser", 200);
			Employee clueless = EmployeeFactory.getInstance("Clueless", 120);

			System.out.println(yahoo);
			System.out.println(google);

			System.out.println(overageEmployee);
			System.out.println(clueless);
			
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(123+".ser"));
			objectOutputStream.writeObject(objectOutputStream);

		} catch (Exception e) {
		}

	}
}
