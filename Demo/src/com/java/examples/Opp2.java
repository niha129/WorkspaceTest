//Arithmatic operations using switch

package com.java.examples;
import java.util.Scanner;

class Opp2 {
	public static void main(String args[])
	{
		int a,b,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("value of a is"+a);
		System.out.println("value of b is"+b);
		System.out.println("1.Addition /n 2.Multiplication /n 3.Subtraction /n 4.Division");
		System.out.println("Enter your choice");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:c=a+b;
		break;
		case 2:c=a*b;
		break;
		case 3:c=a-b;
		break;
		case 4:if(b!=0)
		{
			c=a/b;
			break;
		}
		else
		{
			System.out.println("division is not done");
			break;
		}
		default:System.out.println("invalid number");
		break;
		}
		System.out.println("the value of c is"+c);
		
		
		}
		
		}

	