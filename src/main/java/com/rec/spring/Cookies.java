package com.rec.spring;

import org.springframework.stereotype.Component;

@Component
public class Cookies implements Dessert {

	public String getMessage() {
		return "cookies";
	}

}
