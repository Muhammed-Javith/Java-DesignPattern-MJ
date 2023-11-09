package com.mj;

public class SingletonPatternTest {
	public static void main(String arg[]) throws Exception {
		System.out.println();
		Demo d1 = Demo.getInstance();
		System.out.println("Hashcode of d1 Object: " + d1.hashCode());
		d1.called();
		System.out.println();
		Demo d2 = d1.getInstance();
		System.out.println("Hashcode of d2 Object: " + d2.hashCode());
		d2.called();
		System.out.println();
		Demo d3 = (Demo) d1.clone();
		System.out.println("Hashcode of d3 Object: " + d3.hashCode());
		d3.called();
	}
}
