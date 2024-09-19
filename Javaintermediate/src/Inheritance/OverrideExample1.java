package Inheritance;

class Catest 
{
int eyes =2;
public void walk() {
System.out.println("catest is walking.......... ");
		
	}
}
class Kitten {
	int eyes =2;
	public void walk() {
		System.out.println("kitten is walking..............");
		
	}
}

public class OverrideExample1 {

	public static void main(String[] args) {
		Kitten obj = new Kitten();
		obj.walk();
		System.out.println(obj);
		
		
	}

}
