package com.bird.design.entity;

import org.springframework.stereotype.Component;

@Component
public class FastWalking implements WalkBehavior{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("I can run");
	}

}
