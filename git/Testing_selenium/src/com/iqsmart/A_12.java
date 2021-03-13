package com.iqsmart;

public class A_12 {
	public static void main(String[] args) {
		String str1 = new String("@ Sreealkshmi&*$");
		String specialcharacters = "!@#$%^&~[]{}():=*<>?'";
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			System.out.println(ch);
		
		
		if (specialcharacters.contains(Character.toString(ch))) {
			System.out.println("string contains special characters" + specialcharacters);
		}
		}
		// else
		// System.out.println("string does not contain speccial characters");

	}
}
