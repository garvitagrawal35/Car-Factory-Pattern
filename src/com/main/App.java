package com.main;

import com.factory.pattern.Factory;
import com.myabstract.AbstractCar;

public class App {

	public static void main(String[] args) {
		Factory factory = new Factory();
		AbstractCar abstractCar = factory.deciderClass("Porche");
		abstractCar.brand();
		abstractCar.demo(); 
	}
}
