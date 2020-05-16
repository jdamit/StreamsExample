package com.stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//used for serialization
		FileOutputStream fos= null;
		ObjectOutputStream oos= null;
		
		//used for deserialization
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		fos = new FileOutputStream("C:/Users/Home/Desktop/Interview Notes/dump files/serializationTextFile.txt");
		oos = new ObjectOutputStream(fos);
		Employee emp = new Employee(001, "Damon", 25000.00F, "Mysticfalls");
		System.out.println("Emp object before serialization: "+ emp);
		oos.writeObject(emp);
		
		fis = new FileInputStream("C:/Users/Home/Desktop/Interview Notes/dump files/serializationTextFile.txt");
		ois = new ObjectInputStream(fis);
		Employee e = (Employee) ois.readObject();
		System.out.println("Emp object after serialization: "+e);
	}

}
