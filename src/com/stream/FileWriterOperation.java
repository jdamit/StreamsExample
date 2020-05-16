package com.stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterOperation {

	public static void main(String[] args) throws IOException {
		
		try(FileWriter fw = new FileWriter("C:/Users/Home/Desktop/Interview Notes/dump files/writerTextFile.txt",true);
				Scanner sc = new Scanner(System.in)){
			String data = sc.nextLine();
			char[] chrArr = data.toCharArray();
			fw.write(chrArr);
		}

	}

}
