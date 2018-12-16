package com.evolvus.java.practies.java8features;

@FunctionalInterface
interface FuctionIterface1 {
	void method1(String st1);

	default void log(String str1) {
		System.out.println("Log Interface f1" + str1);
	}

	static void print(String str1) {
		System.out.println("Printing str1" + str1);
	}
}

@FunctionalInterface
interface FuctionIterface2 {
	void method2(String st1);

	default void log(String str1) {
		System.out.println("Log Interface f2" + str1);
	}
}

public class Manager4 implements FuctionIterface1,FuctionIterface2{

	@Override
	public void method2(String st1) {
		System.out.println("Functional Interface2"+st1);
		
	}

	@Override
	public void method1(String st1) {
		System.out.println("Functional Interface1"+st1);
	}
	
	@Override
	public void log(String str1) {
		FuctionIterface2.super.log(str1);
		FuctionIterface1.print(str1);
	}
	
	public static void main(String[] args) {
		Manager4 manager4=new Manager4();
		manager4.method1("abcSS");
		manager4.method1("abcddd");
		manager4.log("Functional Interface");
	}

}
