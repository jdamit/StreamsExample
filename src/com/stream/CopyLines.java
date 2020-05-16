package com.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		PrintWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader("C:/Users/Home/Desktop/Interview Notes/dump files/tempInput.txt"));
			writer = new PrintWriter(new FileWriter("C:/Users/Home/Desktop/Interview Notes/dump files/tempOutputLine.txt"));
			String s = null;
			while((s=reader.readLine()) != null){
				writer.println(s);
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
