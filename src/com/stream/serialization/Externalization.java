package com.stream.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Externalization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// used for serialization
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		// used for deserialization
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		fos = new FileOutputStream("C:/Users/Home/Desktop/Interview Notes/dump files/externalizationTextFile.txt");
		oos = new ObjectOutputStream(fos);
		ExternalizationStudent std = new ExternalizationStudent("DSS-101", "Damon", "damon2027@gmail.com", "9205654689");
		System.out.println("Emp object before externalization: " + std);
		oos.writeObject(std);

		fis = new FileInputStream("C:/Users/Home/Desktop/Interview Notes/dump files/externalizationTextFile.txt");
		ois = new ObjectInputStream(fis);
		ExternalizationStudent e = (ExternalizationStudent) ois.readObject();
		System.out.println("Emp object after externalization: " + e);

	}

}
