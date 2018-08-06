package com.exceptionConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {  //checked Exception

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\Ajin David\\Downloads\\Compresse\\test.txt");
		
		try {
			FileInputStream fso=new FileInputStream(file);
		System.out.println(fso.read());
			
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			
			System.out.println("fadsaf");
		}

	}


}
