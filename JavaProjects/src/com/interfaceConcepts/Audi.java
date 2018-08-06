package com.interfaceConcepts;

public class Audi implements ICar {

	@Override
	public void breaksystem() {
		System.out.println("Break system for audi");

	}

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("steering system for audi");
	}

	@Override
	public void fuel() {
		// TODO Auto-generated method stub
		System.out.println("fuel system for audi");
	}

	@Override
	public void wheel() {
		// TODO Auto-generated method stub
		System.out.println("wheel system for audi");
	}

	@Override
	public void body() {
		// TODO Auto-generated method stub
		System.out.println("body system for audi");
	}

}
