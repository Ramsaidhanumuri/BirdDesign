package com.bird.design.entity;

import org.springframework.stereotype.Component;

@Component
public class EatingSeaFoods implements EatBehavior{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I'm eating sea foods");
		
	}

}
