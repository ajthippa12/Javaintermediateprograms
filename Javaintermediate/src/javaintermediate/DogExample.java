package javaintermediate;

public class DogExample {
	int eyes = 2;
	int tail = 1;
	String name = "chimtu";
	int mouth = 1;
	int nose = 1;

	public void bark() {
		System.out.println("dog is barking");

	}

	public void jump() {

		System.out.println("dog will jump");
	}

	public void walk() {
		System.out.println("dog will walk");

	}

	public void run() {
		System.out.println("dog will run");

	}

	public static void main(String[] args) {

		DogExample obj = new DogExample();
		System.out.println(obj);
		obj.bark();
		obj.jump();
		obj.walk();
		obj.run();

	}

}
