package com.encapsulation;

public class Student {
private String name;
private int rollno;
/**
 * getName method is used to provide the students name.
 * @return  it will  return the student name. 
 */
public String getName() {
	return name;
}
/**
 * setName method is getting the student name .
 * @param name stored the student name.
 */
public void setName(String name) {
	this.name = name;
}
/**
 * getRollno is providing the roll number.
 * @return returns rollno which is getting from setrollno method.
 */
public int getRollno() {
	return rollno;
}
/**
 *  setRoll number stored value .
 * @param rollno it will stored rollnumber .
 */
public void setRollno(int rollno) {
	this.rollno = rollno;
}

 
}
