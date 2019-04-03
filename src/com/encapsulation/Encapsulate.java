package com.encapsulation;

import java.util.Scanner;

public class Encapsulate {

	public static void main(String[] args)  {
		Student stud = new Student();
		Scanner scan = new Scanner(System.in);
		String name = null;
		int rollno = 0;
		//while (scan.hasNext()) {
			 //scan.next();
			// rollno = scan.nextInt();
			System.out.println("enter student name");
			stud.setName(scan.next());
			System.out.println("enter student roll number");
			stud.setRollno(scan.nextInt());

			System.out.println(stud.getName());
			System.out.println(stud.getRollno());
	//	}

		scan.close();
	}

}
