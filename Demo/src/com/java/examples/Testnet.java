package com.java.examples;

class Testnet {
	public static void main(String[] args)
	{
		Net n;
		n=new SBI();
		{
		System.out.println("SBI rate of interest is"+n.getRateOfInterest()+"%");
		}
		n=new PNR();
		{
			System.out.println("PNR rate of interest is"+n.getRateOfInterest()+"%");
		}
	}

}
