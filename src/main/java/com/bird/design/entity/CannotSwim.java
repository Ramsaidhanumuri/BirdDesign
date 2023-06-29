package com.bird.design.entity;

import org.springframework.stereotype.Component;

@Component
public class CannotSwim implements SwimBehavior{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("I cannot swim");
	}

}
