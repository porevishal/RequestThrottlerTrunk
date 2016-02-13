package com.vishal.cache.guava;


public class LoadGeneratorMainClass {

	public static void main(String[] args) throws Exception {

		Employee vishal = new Employee("vishal", "pore", 31);
		Employee siddhi = new Employee("Siddhi", "Pore", 30);
		Employee abhay = new Employee("abhay", "pore", 31);
		Employee vikram = new Employee("vikram", "Pore", 30);
		Employee ishaan = new Employee("ishaan", "pore", 31);
		Employee ashok = new Employee("ashok", "Pore", 30);
		Employee sarala = new Employee("sarala", "pore", 31);
		Employee ranjit = new Employee("ranjit", "Pore", 30);
		Employee amruta = new Employee("amruta", "pore", 31);
		Employee malla = new Employee("malla", "Pore", 30);

		EmployeeSerializer.serialize("vishal", vishal);
		EmployeeSerializer.serialize("siddhi", siddhi);
		EmployeeSerializer.serialize("abhay", abhay);
		EmployeeSerializer.serialize("ishaan", ishaan);
		EmployeeSerializer.serialize("vikram", vikram);
		EmployeeSerializer.serialize("ashok", ashok);
		EmployeeSerializer.serialize("sarala", sarala);
		EmployeeSerializer.serialize("ranjit", ranjit);
		EmployeeSerializer.serialize("amruta", amruta);
		EmployeeSerializer.serialize("malla", malla);
		
		//the classes are loaded
		EmployeeCacheLoader loader = new EmployeeCacheLoader();
		
		loader.load("vishal");
		loader.load("siddhi");
		loader.load("abhay");
		loader.load("ishaan");
		loader.load("vikram");
		loader.load("ashok");
		loader.load("sarala");
		loader.load("ranjit");
		loader.load("amruta");
		loader.load("malla");
		
		//lets see if we can get things from the cache
		EmployeeCache employeeCache = new EmployeeCache();
		
		System.out.println(employeeCache.getEmployee("malla"));
		
		
		
		

	}

}
