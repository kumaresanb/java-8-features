package com.evolvus.java.practies.java8features;

import java.util.function.BiFunction;

class Mutliplication{
	public static int multiply(int a,int b) {
		return a*b;
	}
}

public class Manager9 {
	
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction=Mutliplication::multiply;
		int pr=biFunction.apply(11, 5);
		System.out.println("Product of given number is: "+pr);  
	}

}
