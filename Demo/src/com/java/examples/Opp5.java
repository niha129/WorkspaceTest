package com.java.examples;

public class Opp5 {
	public static void main(String args[])
	{
		int a,b;
		float c,d;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Float.parseFloat(args[2]);
		d=Float.parseFloat(args[3]);
		System.out.println("integer arthimetic operations");
		System.out.println("Addition: "+(a+b)+"\nsubtraction: "+(a-b)+"\nMultiplication: "+(a*b)+"\nDivision: "+(a/b));
	    System.out.println("\n float arthimetic operations\n");
	    System.out.println("Addition: "+(c+d)+"\nSubtraction: "+(c-d)+"\nMultiplication: "+(c*d)+"\nDivision: "+(c/d));
	}

}
