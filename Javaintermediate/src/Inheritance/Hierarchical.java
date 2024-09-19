package Inheritance;

class Animal {
	public void sounds () {
		System.out.println("Sounds of animals");
		
	}
}
class Dogs extends Animal {
	public void bark() {
		System.out.println("Dog is barking");
	}
}
class Cats extends Animal {
	public void meow () {
		System.out.println("cat is meowing");
		
	}
}
class Lion extends Animal {
	public void roar() {
	System.out.println("Lion is roaring");
		
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		Lion obj = new Lion();
		
	obj.roar();
		System.out.println(obj);
		
		
	}

}

