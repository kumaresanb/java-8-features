package com.evolvus.java.practies.java8features;

public class Manager6 {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("My Runnable in anonyums class");

			}
		};
		
		r1.run();
		
		Runnable r2 = ()->{
			System.out.println("My Runnable in Lamda expression");
		};
		
		r2.run();
		
	}

}
