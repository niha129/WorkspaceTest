package com.java.examples;
import java.util.Scanner;

public class Opp3 {
	public static void main (String args[])
	{
		int n,i;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the order");
		n=s.nextInt();
		if(n==0||n==1)
		{
			System.out.println("50% discount");
		}
		else
		{
			for(i=2;i<=n;i++)
			{
				if(i%2==0)
				{
					System.out.println("80% discount");
					flag=true;
					break;
				}
			}
		if(flag==false)
			System.out.println("customer will get 50% discount");
		
	}
}
}
	