package com.evolvus.java.practies.java8features;

import java.awt.Button;
import java.awt.Frame;

public class ButtonListenerNewWay {

	public static void main(String[] args) {
		 Frame frame=new Frame("ActionListener java8");  
	     
	      Button b=new Button("Click Here");  
	      b.setBounds(50,100,80,50); 
	  
	      b.addActionListener(e -> System.out.println("Hello World!")); 
	      frame.add(b);
	  
	      frame.setSize(200,200);  
	      frame.setLayout(null);  
	      frame.setVisible(true);   
	}

}
