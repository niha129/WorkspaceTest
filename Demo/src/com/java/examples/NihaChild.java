package com.java.examples;

public class NihaChild extends Niha {
	
	void add(float a, float b) {
		float f = a + b;
		System.out.println("Addition is:" + f);
		System.out.println("Child class called");
	}
	
	public static void main(String[] args)
	{
		NihaChild nc=new NihaChild();
		nc.add(2f, 3f);
		
		Niha n=new Niha();
		n.add(5, 6);
		
	}

}
