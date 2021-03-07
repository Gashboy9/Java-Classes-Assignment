package assignments;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle tri = new Triangle();
		
		System.out.println("Traingle Area is: " +tri.triangleArea(3, 4));
		System.out.println("Traingle Perimenter is: " +tri.trianglePerimeter(3, 4,5));

	}

}

class Triangle{
	
	double triangleArea(int base, int height) {
		double area = (base*height)/2;
		return area;
	}
	
	double trianglePerimeter(int s1, int s2, int s3) {
		double perimeter = s1+s2+s3;
		return perimeter;
	}
}


