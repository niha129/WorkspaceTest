package com.java.examples;

public class Student {
	int rollno;
	String name;
	static String college="its";
	Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
void display()
{
System.out.println(rollno+" "+name+" "+college);	
}
}

