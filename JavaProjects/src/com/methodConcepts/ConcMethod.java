package com.methodConcepts;

public class ConcMethod {

	public static void main(String[] args) 		//its not a instant method bcoz keyword included in "static"
	{
		ConcMethod c = new ConcMethod();		//object creation
		String h =c.display("Ajin");			//value get from first method(display) that store to 'h'
		c.display2(h);							//call second method(display2)

	}
	
	
	String display(String s)		//String display-"String" indicates the datatype which return
									//String s-"String" indicates the datatype which input
	{
		
		return "Hello_"+s;
	}
	
	void display2(String s)			//No return value,perform only printing.
	{
		System.out.println(s);
	}

}
