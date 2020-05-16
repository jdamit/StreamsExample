package com.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageFileOperation {

	public static void main(String[] args) throws IOException {
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:/Users/Home/Desktop/Interview Notes/dump files/image.jpg");
			out = new FileOutputStream("C:/Users/Home/Desktop/Interview Notes/dump files/outPutImage.jpg");
			int size = in.available();
			byte[] imageData = new byte[size];
			out.write(imageData);
			/*int c;
			while((c=in.read()) != -1){
				out.write(c);
			}*/
		}
		finally{
			if(in != null){
				in.close();
			}
			if(out != null){
				out.close();
			}
		}

		
	}

}
