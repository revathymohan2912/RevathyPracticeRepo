package Assignment3;

abstract class Animal {
	abstract void sound();
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
        }
	}

class Cat extends Animal {
	void sound() {
        System.out.println("Cat meows");
        }
	}

public class Q5_AbstractionUsingAbstractClass {
	public static void main(String[] args) {
		Animal obj1 = new Dog();
		obj1.sound();
		Animal obj2 = new Cat();
		obj2.sound();
    }
}
