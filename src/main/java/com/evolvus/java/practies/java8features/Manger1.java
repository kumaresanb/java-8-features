package com.evolvus.java.practies.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Manger1 {
	
	public static void main(String[] args) {
		List<TextBook> list=new ArrayList();
		list.add(new TextBook("kumar"));
		list.add(new TextBook("ravi"));
		list.add(new TextBook("ram"));
		list.add(new TextBook("shiva"));
		list.add(new TextBook("anu"));
		list.forEach(new Consumer<TextBook>() {
			public void accept(TextBook t) {
				System.out.println("Arralist elements::"+t);
			}
		});
	}

}

class TextBook{
	String name;
	public TextBook(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Name="+name;
	}
}
