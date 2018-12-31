package com.evolvus.java.practies.java8features;

@FunctionalInterface
interface MyInterface{
	void display();
}

public class Manager8 {
	public void myMethod() {
		System.out.println("Instance Method");
	}
	public static void main(String[] args) {
		Manager8 mng=new Manager8();
		
		MyInterface myInter=mng::myMethod;
		myInter.display();
		
		
	}
	
}
