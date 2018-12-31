package com.evolvus.java.practies.java8features;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachExample {

	public static void main(String[] args) {
		List<String> myStrList = new ArrayList<>();
		myStrList.add("kumar");
		myStrList.add("ram");
		myStrList.add("ravi");
		myStrList.add("prabu");
		myStrList.add("krish");
		myStrList.add("sai");

		myStrList.forEach((names) -> System.out.println(names));
	}

}
