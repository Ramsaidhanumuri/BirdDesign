package com.bird.design.entity;

import org.springframework.stereotype.Component;

@Component
public class SlowWalking implements WalkBehavior{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("I can walk slow");
	}

}
