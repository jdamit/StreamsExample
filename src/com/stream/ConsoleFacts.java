package com.stream;

import java.io.Console;

public class ConsoleFacts {

	public static void main(String[] args) {
		Console console = System.console();
		String uName = console.readLine("User name :");
		char[] pwd = console.readPassword("Password :");
		String upwd = new String(pwd);
		if(uName.equals("amit") && upwd.equals("amit")){
			System.out.println("Login successful.");
		}else{
			System.out.println("Login unsuccessful.");
		}

	}

}
