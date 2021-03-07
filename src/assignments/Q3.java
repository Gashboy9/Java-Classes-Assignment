package assignments;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect1 = new Rectangle ();
		Rectangle rect2 = new Rectangle ();
		
		System.out.println(rect1.Area(4, 5));
		System.out.println(rect2.Area(5, 8));
		
	}

}


class Rectangle {
	
	double Area (int length, int breadth) {
		double a = length * breadth;
		
		return a;
	}
	
}
