package com.abstratcConcept;

public class MainAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Vehicle v = new Vehicle();		//we cant create absract object
		Vehicle v = new Jeep();		//first execution on right side(new jeep)
		v.drive();
		v.brake();
		
								//abstract class-restrict instantiation or object creation and forcing inheritance
	}
								
}
