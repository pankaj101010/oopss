package com.resonentia.inheritance.oops;

public class Sample extends Nextsample{
	int a =19;
	int b=25;
	
	
	public void setData(int x,int y,int t,int u){
		a=t;
		b=u;
		setDataAD(x,y);
	}
	public void getData() {
		super.getData();
		
		System.out.println("value of a "+a+" value of b "+b);
	}
}	
