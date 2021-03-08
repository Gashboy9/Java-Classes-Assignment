package assignments;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int real1, imag1, real2, imag2;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter first real number: ");
		real1 = scan.nextInt();
		
		System.out.print("Enter first imaginary number for: ");
		imag1 = scan.nextInt();
		
		
		System.out.print("Enter second real number: ");
		real2 = scan.nextInt();
		
		System.out.print("Enter second imaginary number for: ");
		imag2 = scan.nextInt();
		
		
		Complex com1 = new Complex(real1,imag1);
		Complex com2 = new Complex(real2,imag2);
		
		System.out.print("Sum of complex numbers: ");
		Complex.sum(com1, com2);
		System.out.print("Difference of complex numbers: ");
		Complex.difference(com1, com2);
		System.out.print("Product of complex numbers: ");
		Complex.product(com1, com2);
		
		
		scan.close();
	}

}


class Complex{
	
	double real;
	double imag;
	
	Complex(double r, double i){
		real = r;
		imag = i;
		
		System.out.println(real +" + "+ imag+"i");
	}
	
	public static Complex sum(Complex a, Complex b) {
		return new Complex ((a.real+b.real),(a.imag+b.imag));
	}
	
	public static Complex difference(Complex a, Complex b) {
		return new Complex ((a.real-b.real),(a.imag-b.imag));
	}
	
	public static Complex product(Complex a, Complex b) {
		return new Complex ((a.real*b.real),(a.imag*b.imag));
	}
}
