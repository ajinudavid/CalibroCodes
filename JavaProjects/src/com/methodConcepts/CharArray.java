package com.methodConcepts;

public class CharArray {

	public static void main(String[] args) {
		char a[]= {'a','b','b'};			//initialise array
		
		CharArray o=new CharArray();
		int size=o.display(a, 'b');
		o.display2(size);
//		o.display(a, b,c,d);
//		o.display2(s);
		

	}

	
	int display(char a[],char ch)
	{
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ch) {
				count ++;
			}
		}
		return count;
		
	}
	
	void display2(int s)
	{
		System.out.println(s);
	}
}
