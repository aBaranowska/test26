package com.rec.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Foo {

	@Autowired
	@Qualifier("cold")
	private Dessert dessert;

	public Dessert getDessert() {
		return dessert;
	}

}
