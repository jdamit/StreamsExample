package com.stream.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserSerializationDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fos= null;
		ObjectOutputStream oos= null;
		
		//used for deserialization
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		fos = new FileOutputStream("C:/Users/Home/Desktop/Interview Notes/dump files/userSerializationTextFile.txt");
		oos = new ObjectOutputStream(fos);
		User user = new User("Amit", "abd345kd");
		System.out.println("User object before serialization: "+ user);
		oos.writeObject(user);
		
		fis = new FileInputStream("C:/Users/Home/Desktop/Interview Notes/dump files/userSerializationTextFile.txt");
		ois = new ObjectInputStream(fis);
		User userD = (User) ois.readObject();
		System.out.println("User object after serialization: "+userD);
	}

}

class SubUserSerializationDeserialization{
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos= null;
		ObjectOutputStream oos= null;
		
		//used for deserialization
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		fos = new FileOutputStream("C:/Users/Home/Desktop/Interview Notes/dump files/SubUserSerializationTextFile.txt");
		oos = new ObjectOutputStream(fos);
		SubUser subUser = new SubUser("Amit", "abd345kd", "Noida");
		System.out.println("User object before serialization: "+ subUser);
		oos.writeObject(subUser);
		
		fis = new FileInputStream("C:/Users/Home/Desktop/Interview Notes/dump files/SubUserSerializationTextFile.txt");
		ois = new ObjectInputStream(fis);
		SubUser userD = (SubUser) ois.readObject();
		System.out.println("User object after serialization: "+userD);
	}
}
