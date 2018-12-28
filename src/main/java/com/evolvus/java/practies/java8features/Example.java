package com.evolvus.java.practies.java8features;

@FunctionalInterface
interface MyFunctionalInterface {
	// A method with no parameter
	public String sayHello();
}

interface MyFunctionalInterface1 {
	public int incrementNum(int a);
}

interface StringConcat {
	public String scconcat(String a, String b);
}

public class Example {
	public static void main(String[] args) {
		// lambda expression
		MyFunctionalInterface msg = () -> {
			return "Hello";
		};

		System.out.println(msg.sayHello());

		MyFunctionalInterface1 msg1 = (num) -> num + 5;
		System.out.println(msg1.incrementNum(30));

		StringConcat strCon = (str1, str2) -> str1 + str2;
		System.out.println(strCon.scconcat("Hello ", "Word"));
	}
}
