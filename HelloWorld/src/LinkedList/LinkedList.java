package LinkedList;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.LinkedList<String> cars = new java.util.LinkedList<String>();

		cars.add("Bmw");
		cars.add("Billy");
		
		System.out.print(cars);
		
		cars.remove("Billy");
		
		System.out.print(cars);
		

	}

}
