package com.bird.design.entity;

import org.springframework.stereotype.Component;

@Component
public class CanSwim implements SwimBehavior{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("I'm swimming");
	}

}
