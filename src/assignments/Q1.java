package assignments;

public class Q1 {
	
	public static void main (String [] args) {
		
		Student st1 = new Student();
		
		st1.name ="John";
		st1.roll_no = 2;
		
		st1.display();
	}

}



  class Student {
	  
	  String name;
	  int roll_no;
	  
	  void display() {
		  System.out.println(name+ " " +roll_no);
	  }
	  
 }