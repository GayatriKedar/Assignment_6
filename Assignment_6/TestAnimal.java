package assignment02Oct;

abstract class Animal {
	abstract public void sound();

	abstract public void move();
}

class Dog extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Barks");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Move");
	}

}

class Cat extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Meow");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Move");
	}

}

class Bird extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Chiv");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Move");
	}

}

public class TestAnimal {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.sound();
		dog.move();

		System.out.println("===================");

		Cat cat = new Cat();
		cat.sound();
		cat.move();

		System.out.println("===================");

		Bird bird = new Bird();
		bird.sound();
		bird.move();

	}

}
