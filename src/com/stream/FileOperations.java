package com.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		InputStream in = null;
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		try {
			in = new FileInputStream("C:/Users/Home/Desktop/Interview Notes/dump files/"+fileName+".txt");
			int size = in.available();
			byte[] byteData = new byte[size];
			in.read(byteData);
			String data = new String(byteData);
			System.out.println(data);
			
			String[] wordsArr = data.split(" ");
			char[] arr = data.toCharArray();
			int count = 0;
			for(int i = 0; i<arr.length-1; i++){
				if(arr[i] == ' '){
					count++;
				}else if(arr[i] == '\n'){
					count++;
				}
			}
			/*int temp = 0;
			for(String s : wordsArr){
				System.out.println(s +" "+ ++temp);
			}*/
			System.out.println("No. of words given by split method are "+wordsArr.length);
			System.out.println("No. of words given by for loop using char array are: "+count);
		}
		finally{
			if(in != null){
				in.close();
			}
		}

	}

}
