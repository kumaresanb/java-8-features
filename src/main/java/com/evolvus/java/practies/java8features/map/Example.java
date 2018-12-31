package com.evolvus.java.practies.java8features.map;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Example {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(Long.valueOf(1));
		student.setSrlNo("1332");
		student.setName("Ram");
		student.setDob(new Date(1982, 01, 01));
		student.setDepartName("ECE");

		Student student1 = new Student();
		student1.setId(Long.valueOf(2));
		student1.setSrlNo("1333");
		student1.setName("Raju");
		student1.setDob(new Date(1983, 04, 05));
		student1.setDepartName("EEE");
		

		Student student2 = new Student();
		student2.setId(Long.valueOf(3));
		student2.setSrlNo("1334");
		student2.setName("Kishore");
		student2.setDob(new Date(1982, 04,02));
		student2.setDepartName("CSE");
		

		HashMap<Long, Student> hashMap = new HashMap<>();
		hashMap.put(student.getId(), student);
		hashMap.put(student1.getId(), student1);
		for (Map.Entry<Long, Student> maEntry : hashMap.entrySet()) {
			
			System.out.println("Student Object:"+maEntry.getValue());
			
		}

	}

}
