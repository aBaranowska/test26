package com.rec.spring;

import org.springframework.stereotype.Component;

@Component
public class Cake implements Dessert {

	public String getMessage() {
		return "cake";
	}

}
