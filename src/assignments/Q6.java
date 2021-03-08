package assignments;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rooms r1 = new Rooms();
		
		r1.setData(0, null, null, null);
		r1.displayData();

	}

}


class Rooms {
	int roomNo;
	String roomType;
	String roomArea;
	String ACmachine;
	
	void setData(int rn, String rt, String ra, String ac) {
		roomNo = rn;
		roomType = rt;
		roomArea = ra;
		ACmachine = ac;
	}
	
	void displayData(){
		System.out.println("Room number is: " +roomNo);
		System.out.println("Room type is: " +roomType);
		System.out.println("Room area is: " +roomArea);
		System.out.println("AC machine is: " +ACmachine);
	}
}
