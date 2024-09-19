package Inheritance;

class Polygon {
	int depth =30;
	public void chord() {
		System.out.println("chord");
		
	}
}
class Rect extends Polygon{
	int sides=10;
	int width =20;
	public void diameter() {
		System.out.println("diameter");
	}
		
	}
	
	class Tri extends Rect{
		int distance;
		public void dim() {
			System.out.println("dim");
			
		}
		
	}



public class Multilevel {

	public static void main(String[] args) {
	//Rectangle obj = new Rectangle();
	Tri obj = new Tri();
	obj.diameter();
	obj.dim();
	obj.chord();

	}

}   
