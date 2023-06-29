package com.bird.design.entity;

public class Duck extends Bird {

	public Duck() {
		// TODO Auto-generated constructor stub
		setEatBehavior(new EatingSeaFoods());
		setFlyBehavior(new CanFly());
		setSwimBehavior(new CanSwim());
		setWalkBehavior(new SlowWalking());
	}
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Quack...!, Quack...!");

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Duck");

	}

}
