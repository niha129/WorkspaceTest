package com.java.examples;

public class Niha {

	static void add(int a, int b) {
		int f = a + b;
		System.out.println("Addition is:" + f);
		System.out.println("Parent class called");
	}

	void sub(int a, int b, int c) {
		int f = a - b - c;
		System.out.println("Subtraction is:" + f);
	}

	void mul(int a,int b,int c,int d,int e)
	{
		int f=a*b*c*d*e;
		System.out.println("Multiplication is" +f);
	}

	public static void main(String[] args)
	{
		
		Niha.add(2,3);
		
	}

}
