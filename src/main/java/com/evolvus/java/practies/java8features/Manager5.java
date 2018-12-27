package com.evolvus.java.practies.java8features;

import java.util.ArrayList;
import java.util.List;

public class Manager5 {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("kumar");
		list.add("ram");
		list.add("ravi");		
		list.add("mahi");
		list.add("shriman");
		
		list.forEach(str->{
			System.out.println(str);
		});
		
		
	}

}
