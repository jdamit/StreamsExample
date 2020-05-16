package com.stream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderOperation {

	public static void main(String[] args) throws IOException {
		
		try(FileReader fr = new FileReader("C:/Users/Home/Desktop/Interview Notes/dump files/writerTextFile.txt")){
			String data = "";
			int value = fr.read();
			while(value != -1){
				data = data+(char)value;
				value = fr.read();
			}
			System.out.println(data);
		}

	}

}
