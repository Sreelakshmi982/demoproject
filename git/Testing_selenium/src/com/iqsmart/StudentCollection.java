package com.iqsmart;

import java.util.ArrayList;

public class StudentCollection {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("student1");
		student1.setAge(5);
		Student student2 = new Student();
		student2.setName("student2");
		student2.setAge(10);
		ArrayList<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		for(Student student : students) {
			System.out.println(student.getName()+":"+student.getAge());
		}
	}
}
