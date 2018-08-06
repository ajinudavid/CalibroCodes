package com.inheritenceConcept;

public abstract class MyParrent {
	public void displaysum(int x,int y) 
	{
		long sum=calculate(x,y);
		System.out.println("sum is "+sum);
	}
public abstract long calculate(int k,int m);
}
