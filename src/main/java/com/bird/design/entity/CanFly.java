package com.bird.design.entity;

import org.springframework.stereotype.Component;

@Component
public class CanFly implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I'm flying");

	}

}
