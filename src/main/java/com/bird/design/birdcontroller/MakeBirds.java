package com.bird.design.birdcontroller;

import com.bird.design.entity.Bird;
import com.bird.design.entity.Duck;

public class MakeBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird duck = new Duck();
		duck.display();
		duck.makeSound();
		duck.performEat();
		duck.performFly();
		duck.performSwim();
		duck.performWalk();
	}

}
