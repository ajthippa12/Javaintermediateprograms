package Inheritance;

class Dog{
	int eyes =2;
	int nose =1;
	public void eat() {
		System.out.println("dog  is eating...........");
		
	}
	public void bark() {
		System.out.println("dog is barking.........");
	}
}
	class Puppy extends Dog{
		int eyes =2;
		int nose =1;
		public void eat() {
			System.out.println("puppy is eating..........");
		}
		public void bark() {
			System.out.println("puppy is barking.............");
		}
	}

	public class OverrideExample2 {
	public static void main(String[] args) {
		Puppy obj  = new Puppy();
		obj.eat();
		obj.bark();
		System.out.println(obj);
		

	}
	}
