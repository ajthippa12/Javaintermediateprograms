package javaintermediate;

public class CatExample {

	int eyes = 2;
	int nose = 1;
	int legs = 2;

	public void jump() {
		System.out.println("cat jumps");
	}

	public void run() {
		System.out.println("cat walks");
	}

	public void walk() {
		System.out.println("cat run");
	}

	public void eatmice() {
		System.out.println("cat eat mice");
	}

	public static void main(String[] args) {
		CatExample obj = new CatExample();
		System.out.println(obj);
		obj.jump();
		obj.walk();
		obj.run();
		obj.eatmice();

	}
}