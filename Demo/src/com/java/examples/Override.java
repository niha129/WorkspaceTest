package com.java.examples;

public class Override extends Over {
	void connect()
	{
		System.out.println("connect to jio wifi");
	}
	public static void main(String[] args)
	{
		Override r=new Override();
		r.connect();
		
		
	}

}
