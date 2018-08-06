package com.exceptionConcepts;

public class Unchecked2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a,b;
//a=10;
//b=2;
int array[]= {3,2,3};
try {
//	int c=a/b;
//	System.out.println(c);
	System.out.println(array[0]);
	System.out.println(array[1]);
	System.out.println(array[2]);
	System.out.println(array[3]);
	
}
catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("Maximum array size is 3");
}
		
	}

}
