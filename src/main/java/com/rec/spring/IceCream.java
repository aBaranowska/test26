package com.rec.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cold")
public class IceCream implements Dessert {

	public String getMessage() {
		return "iceCream";
	}

}
