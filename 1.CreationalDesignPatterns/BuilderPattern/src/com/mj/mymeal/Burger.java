package com.mj.mymeal;

import com.mjtech.Item;
import com.mjtech.Packing;
import com.mjtech.Wrapper;

public abstract class Burger implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override

	public abstract float price();
}
