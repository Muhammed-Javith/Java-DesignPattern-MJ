package com.mj;

public class Test implements Cloneable {
	int x;
	String s;

	public Test(int y, String r) {
		this.x = y;
		this.s = r;
		System.out.println("Test: 2- arg Constructor");
	}

	public Object clone() {
		try {
			// ProtoType Pattern Logic
			return super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// Normal method to display Values
	public String display() {
		return "Value of X =" + x + " & S =" + s;
	}
}
