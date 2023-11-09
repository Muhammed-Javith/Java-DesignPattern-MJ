package com.mj;

public class FactoryEx {
	public static void main(String[] args) throws Exception {
		Test t1 = Test.staticFactoryMethod();
		System.out.println(t1); // which internally calls toString()
		Test t2 = t1.instanceFactoryMethod();
		System.out.println(t2);
	}
}