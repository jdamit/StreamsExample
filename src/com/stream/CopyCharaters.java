package com.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharaters {

	public static void main(String[] args) throws IOException {
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			reader = new FileReader("C:/Users/Home/Desktop/Interview Notes/dump files/tempInput.txt");
			writer = new FileWriter("C:/Users/Home/Desktop/Interview Notes/dump files/tempOutputCharacters.txt");
			int c;
			while((c=reader.read()) != -1){
				writer.write(c);
			}
		}
		finally{
			if(reader != null){
				reader.close();
			}
			if(writer != null){
				writer.close();
			}
		}

	}
}
