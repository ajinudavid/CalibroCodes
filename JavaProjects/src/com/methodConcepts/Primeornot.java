package com.methodConcepts;

public class Primeornot {

	public static void main(String[] args) {
		
		Primeornot o=new Primeornot();	
		if(o.displaynumber(3))
		{
			System.out.println("is prime");
		}
		else
		{
			System.out.println("Not prime");
		}
		
	}

	
	
	boolean displaynumber(int s)		//s is the value for checking is prime or not
	{
		
		int i=2;
		
		for(i=2;i<s;i++)	
		{
			if(s%i==0)
			{
					
			return false;
			}
		}

		return true;
	}
}
