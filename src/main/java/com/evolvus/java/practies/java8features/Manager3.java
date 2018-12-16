package com.evolvus.java.practies.java8features;

import java.util.function.IntBinaryOperator;

@FunctionalInterface
interface Interface1 {
	public int addMethod(int a, int b);
}

public class Manager3  {
	public static void main(String[] args) {
			Interface1 sum=(a,b)->a+b;
			System.out.println("Result::"+sum.addMethod(20,10));
			IntBinaryOperator sum1=(a,b)->a-b;
			System.out.println("Result1::"+sum1.applyAsInt(20, 12));
	}
}
