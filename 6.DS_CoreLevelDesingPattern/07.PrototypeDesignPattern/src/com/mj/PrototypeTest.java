package com.mj;

public class PrototypeTest {
	public static void main(String[] args) throws Exception {
		Test t1 = new Test(10, "Durga");// Object creation in Normal Way
		System.out.println("Hadscode of T1 Object is : " + t1.hashCode());
		System.out.println(t1.display());
		Test t2 = (Test) t1.clone();// Object through Cloning Process
		System.out.println("Hadscode of T2 Object is : " + t2.hashCode());
		System.out.println(t2.display());
		// do some modifications
		System.out.println("After Performing Modifications:");
		t1.x = 20;
		System.out.println(t1.display());
		System.out.println(t2.display());
	}

}
