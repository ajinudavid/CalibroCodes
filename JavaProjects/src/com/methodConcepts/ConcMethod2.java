package com.methodConcepts;

public class ConcMethod2 {

	public static void main(String[] args) {
		ConcMethod2 c = new ConcMethod2();
		String h =c.display("Ajin");
		//c.display2(h);

	}
	
	String display(String s)
	{
		
		String h= "Hello"+s;
		display2(h);
		return h;
	}
	void display2(String s)
	{
		System.out.println(s);
	}
}
