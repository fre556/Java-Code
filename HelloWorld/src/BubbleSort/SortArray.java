package BubbleSort;

public class SortArray {

	public static void main(String[] args) {
		//BubbleSort ob - new BubbleSort();
		int number_array[] = {1,10,50,100,63,42,20,42};
		
		 
		
		for (int i=0; i < number_array.length;i++) {
			System.out.print(number_array[i] + " ," );
		}
		
		bubbleSort(number_array);
		
		System.out.print("\n");
		
		for (int i=0; i < number_array.length;i++) {
			System.out.print(number_array[i] + " ," );
		}

	}
	
	static void bubbleSort(int[]arr) {
		//gets length of array	
		int n = arr.length + 1;
		
		int temp =0;
		
		for (int i=0;i<n;i++) {
			for(int j=1; j <(n-1);j++) {
				if (arr[j-1] > arr[j]) {
					temp  = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
