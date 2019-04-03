package com.abstraction.testing.abstrct;

// class must be public, abstract & final are permitted only
public abstract class Calling {
	private int i;
	// abstract method must public , protected and default
	protected abstract int getdata(int x, int y);
	public abstract void login();
	public void show() {
		
		System.out.println("hi");
	}

}
