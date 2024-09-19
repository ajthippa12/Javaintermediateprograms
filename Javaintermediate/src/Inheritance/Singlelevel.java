package Inheritance;

class Rectangle{
	int sides=10;
	int width =20;
	public void diameter() {
		System.out.println("diameter");
	}
	
		
	}
	
	class Triangle extends Rectangle{
		int distance;
		public void dim() {
			System.out.println("dim");
			
		}
		
	}



public class Singlelevel {

	public static void main(String[] args) {
	
	Triangle obj = new Triangle();
	obj.diameter();
	obj.dim();

	}

}   
