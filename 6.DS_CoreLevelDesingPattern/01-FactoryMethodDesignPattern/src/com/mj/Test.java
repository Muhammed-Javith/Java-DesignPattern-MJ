package com.mj;

class Test {
	int x;

//private zero argument constructor
	private Test() {
		System.out.println("Test: 0-arg Con");
	}

//static factory method
	public static Test staticFactoryMethod() {
		Test t = new Test();
		t.x = 5;
		return t;
	}

//instance factory method
	public Test instanceFactoryMethod() {
		Test t = new Test();
		t.x = this.x + 5;
		return t;
	}
	public String toString() {
		return "x=" + x;
	}
};