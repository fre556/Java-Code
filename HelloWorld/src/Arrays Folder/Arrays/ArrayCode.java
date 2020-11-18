package Arrays;

public class ArrayCode {

	public static void main(String[] args) {
		
		double[] testList = {1.0,2.3,7,2,1.2,1.8,2.8,9.2};
		double total=0;
		
		//print elements of all arrays
		for(int i=0; i<testList.length;i ++) {
			System.out.println(testList[i] + " ");
		}
		
		System.out.print("\n");
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		
		int arr[]= {12,33,44,12,23};
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
