package assignments;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter length of rectangle: ");
		int length = scan.nextInt();
		
		System.out.print("Enter breadth of rectangle: ");
		int breadth = scan.nextInt();
		
		Area rect1 = new Area (length, breadth);
		rect1.returnArea();

		
		scan.close();
	}

}



class Area{
	int length;
	int breadth;
	
	Area(int l, int b){
		length = l;
		breadth = b;
	}
	void returnArea() {
		double area = length * breadth;
		System.out.println("Area of rectangle is " +area);
	}
}
