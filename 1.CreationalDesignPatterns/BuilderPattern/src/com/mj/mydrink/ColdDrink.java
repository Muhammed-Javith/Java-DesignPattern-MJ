package com.mj.mydrink;

import com.mjtech.Bottle;
import com.mjtech.Item;
import com.mjtech.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
