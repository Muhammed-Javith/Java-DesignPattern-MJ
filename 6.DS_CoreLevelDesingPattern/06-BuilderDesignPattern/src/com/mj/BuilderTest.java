package com.mj;

public class BuilderTest {
	public static void main(String[] args) throws Exception {
		BuilderTest bt = new BuilderTest();
		String s = bt.parts();
		int cost = bt.calPrice();
		System.out.println();
		System.out.println("Your Product Consists Of " + s);
		System.out.println();
		System.out.println("Your Product Total Cost is Rs." + cost + "/-");
	}

	public String parts() {
		return "One " + new Cpu().name() + ", One " + new Monitor().name() + " & Some " + new Perphirals().name();
	}

	public int calPrice() {
		return new Cpu().price() + new Monitor().price() + new Perphirals().price();
	}

}
