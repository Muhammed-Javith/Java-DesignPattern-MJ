package com.mj;

class Demo {
	private static Demo instance;

	private Demo() {
		System.out.println("Demo : 0-arg Con");
	}

//static factory method
	public static synchronized Demo getInstance() {
// Singleton Logic
		if (instance == null)
			instance = new Demo();
		return instance;
	}

//override Object class clone()
	public Object clone() {
		return instance;
	}
//normal method

	public void called() {
		System.out.println("The normal method will be called");
	}
}