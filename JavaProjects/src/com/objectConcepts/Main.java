package com.objectConcepts;

public class Main {
	//instances created on the same package Ex-string name,int age--Reffer program employee

	public static void main(String[] args) {
		Employee a=new Employee();
		a.name="ajin";							//a,b,c--Refference variable
		Employee b=new Employee();
		b.age=26;
		Employee c=new Employee();
		c.name="ajin";
		c.age=26;
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(a.name);
		System.out.println(b.age);
	}

}
