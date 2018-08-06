package com.exceptionConcepts;

public class Unchecked1 {
	public static void main(String[] args) {
		
		int a,b;
		a=6;
		b=0;
		int array[]= {4,2,3};
		try {
		int c=a/b;
		System.out.println(c);
		System.out.println(array[2]);

		}
		catch (ArithmeticException e) {
			System.out.println("Denominator should be zero");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Maximum array size is 3");
		}

		}

}
