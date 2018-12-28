package com.evolvus.java.practies.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Manager7 {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			myList.add(i);
		// sequential stream
		Stream<Integer> mySequentialStream = myList.stream();

		// parallel stream
		Stream<Integer> myParallelStream = myList.parallelStream();

		Stream<Integer> highNum = myParallelStream.filter(p -> p > 80);

		highNum.forEach(p -> System.out.println("High Nums Parallel=" + p));
		System.out.println("---------------------------------------------");
		Stream<Integer> highNumsSeq = mySequentialStream.filter(p -> p > 80);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential=" + p));
	}
}
