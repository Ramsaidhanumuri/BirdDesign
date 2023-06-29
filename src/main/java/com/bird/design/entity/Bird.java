package com.bird.design.entity;

public abstract class Bird {

	private FlyBehavior flyBehavior;
	private EatBehavior eatBehavior;
	private SwimBehavior swimBehavior;
	private WalkBehavior walkBehavior;

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setEatBehavior(EatBehavior eatBehavior) {
		this.eatBehavior = eatBehavior;
	}

	public void setSwimBehavior(SwimBehavior swimBehavior) {
		this.swimBehavior = swimBehavior;
	}

	public void setWalkBehavior(WalkBehavior walkBehavior) {
		this.walkBehavior = walkBehavior;
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void performEat() {
		eatBehavior.eat();
	}

	public void performSwim() {
		swimBehavior.swim();
	}

	public void performWalk() {
		walkBehavior.walk();
	}

	public abstract void makeSound();

	public abstract void display();

}
