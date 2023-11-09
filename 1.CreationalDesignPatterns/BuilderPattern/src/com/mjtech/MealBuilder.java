package com.mjtech;

import com.mj.mydrink.Coke;
import com.mj.mydrink.Pepsi;
import com.mj.mymeal.ChickenBurger;
import com.mj.mymeal.VegBurger;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}