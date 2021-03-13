package com.iqsmart;

public class ClassObjects {
	String name = "Sreelakshmi";

	public static void main(String[] args) {
		String phonenum = "7989939155";
		ClassObjects obj = new ClassObjects();
		details dim = obj.new details();
		dim.details();

	}

	class details {
		public void details() {
			int value = 78;
			String course = "java";
			System.out.println(name);
		}
	}
}