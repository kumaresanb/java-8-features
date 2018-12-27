package com.evolvus.java.practies.java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Manager {
	public static void main(String[] args) {
		List<Integer> myList=new ArrayList<>();
		for (int i = 0; i < 10; i++) myList.add(i);
		
		Iterator<Integer> iterator=myList.iterator();
		while (iterator.hasNext()) {
			System.out.println("Ierator value::"+iterator.next());
			
		}
		
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
					System.out.println("forEach anonymous class values::"+t);
			}
			
		});
		
		myList.forEach(arg->System.out.println("Lamda Expression:"+arg));
		
		/*MyConsumer myConsumer=new MyConsumer();
		myList.forEach(myConsumer);*/
				
	
	}

}

class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("myConsumer class values::"+t);
	}
	
}
