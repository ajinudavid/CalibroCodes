package com.interfaceConcepts;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ICar Bmw=new Bmw();
ICar Audi=new Audi();
ICar[] cars= {Bmw,Audi};
for(ICar car:cars)
{
	car.breaksystem();
	car.fuel();
	}
}}
