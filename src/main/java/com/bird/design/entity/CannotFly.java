package com.bird.design.entity;

import org.springframework.stereotype.Component;

@Component
public class CannotFly implements FlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I cannot fly");
		
	}

}
