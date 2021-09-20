
//find the no of students in the examhall where sit in even and add order and students in a class is less than 100?
package com.java.examples;
 class Oop1 {
	 public static void main(String args[])
	 {
		 int sumeven=0,sumodd=0;
		 for(int i=0;i<=100;i++)
		 {
			 if(i%2==0)
			 {
				 sumeven=sumeven+i;
			 }
			 else
			 {
				 sumodd=sumodd+i;
			 }
			 System.out.println("The Sumeven result is" +sumeven);
			 System.out.println("The Sumodd result is" +sumodd);
			 
		 }
	 }
 }
	 