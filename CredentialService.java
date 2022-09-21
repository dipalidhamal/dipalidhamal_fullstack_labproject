package com.email.service;

import java.util.Random;

public class CredentialService {
	
		public char[] generatePassword() {
		
		String numbers = "0123456789";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "~!@#$%^&*_-=+?/<>";
	
		String values = capitalLetters + smallLetters + numbers + specialCharacters ;
		
		Random random = new Random();
		char[] password = new char[11];
		
		for(int i=0 ; i<11;i++) {
			
			int rand=(int)(Math.random()*values.length());
			password[i]=values.charAt(rand);
			
		}
		return password;
		
	}
	
		public String generateEmailAddress (String firstName , String lastName , String department ) {
		return firstName + lastName + "@" + department + ".Bocsh.com";   
		} 
	
		public void showCredentials(String firstName , String Email , char[] generatedpwd ) {
		
		System.out.println ("Dear"+ firstName +" your generated credentials are as follows");
		System.out.println ("Email ---->"+Email);
		System.out.println ("Password ---->"+generatedpwd);
	}

}
