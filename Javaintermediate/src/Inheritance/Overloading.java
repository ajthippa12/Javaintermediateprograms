package Inheritance;

public class Overloading {
	public void add(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(sum);
		
	}
	public void add(int num1, float num2) {
		float sum = num1+num2;
		System.out.println(sum);
		
	}
	public void add(float num1, float num2) {
		float sum = num1+num2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		 Overloading obj  = new Overloading();
		 obj.add(1, 0);
		 obj.add(4, 5.6f);
		 obj.add(2.3f,4.5f);
		
		

	}

}

