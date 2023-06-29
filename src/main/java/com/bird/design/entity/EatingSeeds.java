package com.bird.design.entity;

import org.springframework.stereotype.Component;

@Component
public class EatingSeeds implements EatBehavior{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I'm eating seeds");
	}

}
