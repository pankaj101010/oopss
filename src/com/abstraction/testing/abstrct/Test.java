package com.abstraction.testing.abstrct;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
	    
		// we cannot create an object of abstract class.
		Calling obj;
		obj = new Circle();
		System.out.println(obj.getdata(4, 6));
		obj.show();
		obj = new Addtion();
		System.out.println(obj.getdata(3, 4));
		System.out.println("2"+3+2+2);
		char a ='2';
		String w = "1";
		int m = a;
		System.out.println(w);
	}
}