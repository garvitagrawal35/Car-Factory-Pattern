package com.factory.pattern;

import com.myabstract.AbstractCar;
import com.myabstract.impl.ChevroletImpl;
import com.myabstract.impl.FerrariImpl;
import com.myabstract.impl.PorcheImpl;

public class Factory {

	public AbstractCar deciderClass(String choice) {

		if (choice.equalsIgnoreCase("Ferrari")) {
			return new FerrariImpl();
		} else if (choice.equalsIgnoreCase("Chevrolet")) {
			return new ChevroletImpl();
		} else if (choice.equalsIgnoreCase("Porche")) {
			return new PorcheImpl();
		}
		return null;
	}
}
